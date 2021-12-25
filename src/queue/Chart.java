package queue;

import java.awt.BasicStroke;
import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class Chart {

    /**
     * A frame for displaying the chart.
     */
    private ChartFrame frame = null;

    private int[] array_nt;
    private double u;
    private double λ;
    private int k;
    private int M;
    private int length = 0;

    /**
     * Displays a sample chart in its own frame.
     */
    public Chart(double u, double λ, int k) {
        this.u = u;
        this.λ = λ;
        this.k = k;
        this.M = 0;
    }

    public Chart(double u, double λ, int k, int M) {
        this.u = u;
        this.λ = λ;
        this.k = k;
        this.M = M;
    }

    void displayChart() {
        if (this.frame == null) {

            // create a default chart based on some sample data...
            final String title = "";
            final String xAxisLabel = "Time (t)";
            final String yAxisLabel = "Number of Customers n(t)";

            final XYDataset data = createStepXYDataset();

            final JFreeChart chart = ChartFactory.createXYStepChart(
                    title,
                    xAxisLabel, yAxisLabel,
                    data,
                    PlotOrientation.VERTICAL,
                    false, // legend
                    true, // tooltips
                    false // urls
            );

            // then customise it a little...
            chart.setBackgroundPaint(new Color(255, 255, 255));
            final XYPlot plot = chart.getXYPlot();
            plot.getRenderer().setSeriesStroke(0, new BasicStroke(2.0f));
            plot.getRenderer().setSeriesPaint(0, BLACK);
            plot.setBackgroundPaint(WHITE);
            plot.setDomainGridlinesVisible(true);
            plot.setDomainGridlinePaint(BLACK);
            plot.setRangeGridlinesVisible(true);
            plot.setRangeGridlinePaint(BLACK);

            NumberAxis domainAxiss = new NumberAxis(xAxisLabel);
            domainAxiss.setRange(0, 1);

            domainAxiss.setAutoRange(true);
            plot.setDomainAxis(domainAxiss);

//            domainAxiss.setTickLabelsVisible(false);// to show the number under domain axis
// and present it in a frame...
            this.frame = new ChartFrame("Deterministic Queue Graph", chart);
            this.frame.pack();
           
            this.frame.setVisible(true);

        } else {
            this.frame.setVisible(true);
            this.frame.requestFocus();
        }
    }

    /**
     * Creates and returns a sample dataset for the XY 'Step' chart.
     *
     * @return the sample dataset.
     */
    public XYDataset createStepXYDataset() {

        final XYSeries s1 = new XYSeries("", true, true);
//        final int Tlmda = 4;
//        DD dq = new DD((double) 1 / 6, (double) 1 / 4, 5);
//        int[] ndata = dq.drawnt(100); //new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        DD dq;

        if (M == 0) {
            dq = new DD(u, λ, k);
            dq.get_ti();
            length = (int) (1 / λ) * 45;
            array_nt = dq.drawnt(length);
        } else {
            dq = new DD(u, λ, k, M);
            dq.get_ti_2();
            length = (int) (1 / λ) * 45;
            array_nt = dq.drawnt_2(length);
        }
        for (int i = 0; i < array_nt.length; i++) {
            //System.out.println("AT time = " + i + " n(t) = " + array_nt[i]);
            s1.add(i, array_nt[i]);
        }

        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s1);
        return dataset;
    }

//    public static void main(final String[] args) {
//
//        final Chart demo = new Chart(array_nt);
//        demo.displayChart();
//
//    }
}
