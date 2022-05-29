package no.dervis.learningjava.labs.bank.loan;

import no.dervis.learningjava.labs.bank.banking.Asset;
import no.dervis.learningjava.labs.bank.banking.Liability;

/**
 * Asset: a bank can give loan and get interests
 * Liability: A bank can take up loan from other banks
 *
 * <a href="https://www.experian.com/blogs/ask-experian/types-of-loans/">Types of loans</a>
 */

public interface Loan extends Asset, Liability {

    enum LoanType {
        /**
         * Home, land, or other types of real estate.
         */
        MORTGAGE,

        /**
         * Any type of vehicle. The vehicle serves as collateral .
         */
        AUTO,

        /**
         * Aka term loan, is repaid with fixed payments over a set period.
         */
        INSTALLMENT,

        /**
         * Allow withdrawals up to a predetermined credit limit and payments in variable amounts,
         * and only charge interest on outstanding balances. At the end of each billing cycle,
         * you can either repay what you've borrowed in full or carry over ("revolve") a balance
         * to the next month, making only a minimum payment.
         * Aka "personal line of credit".
         */
        REVOLVING_CREDIT,

        /**
         * Personal loans are usually unsecured, meaning they do not require collateral. They may have
         * fixed or variable interest rates and repayment terms of a few months to several years.
         */
        PERSONAL,

        /**
         * Federal student loans offer deferment, forbearance, forgiveness and income-based repayment options.
         * They typically don't require a credit check and loan terms (including fees, repayment periods
         * and interest rates) are the same for every borrower with the same type of loan.
         */
        STUDENT
    }
    enum RateType {
        FIXED_RATE,
        ADJUSTABLE_RATE,
        FIXED_TO_ADJUSTABLE_RATE
    }

    enum SecurityType {
        /**
         * Uses an asset you own as collateral;
         * the lender can take the asset if you don't repay the loan.
         */
        SECURED,

        /**
         * Requires no collateral. They usually have higher interest rates
         * than secured loans because they are riskier for lenders
         */
        UNSECURED
    }

    /**
     * @return an asset that a lender accepts as security for a loan
     */
    Asset getCollateral();
}
