package CS1061HW3;

/**
 * Invoice extends Payable
 * allows for non employee payments
 *
 * <p>
 * Execute:</p>
 * <pre>java Invoice</pre>
 *
 * @param argsnot used.
 * @author  Spencer Medberry, S01027971
 * @version2024-2-3, CSC-1061 Assignment 3
 */
public class Invoice extends Payable {
    private String contractorName;
    private String contractJob;
    private double invoiceTotal;

    public Invoice(String contractor, String job, double total) {
        contractorName = contractor;
        contractJob = job;
        invoiceTotal = total;
    } // end Invoice constructor

    //accessors
    public void setContractorName(String contractor) {
        contractorName = contractor;
    }

    public String getContractorName() {
        return contractorName;
    }

    public void setContractJob(String job) {
        contractJob = job;
    }

    public String getContractJob() {
        return contractJob;
    }

    public void setInvoiceTotal(int total) {
        invoiceTotal = Math.max(total, 0.0);
    }

    public double getPaymentAmount() {
        return invoiceTotal;
    }
    //end of accessors

    @Override
    public String toString() {
        return String.format("Contractor: %s\nJob: %s\nInvoiced Total: $%,.2f",
                getContractorName(), getContractJob(), getPaymentAmount());
    }
} // end class Invoice

