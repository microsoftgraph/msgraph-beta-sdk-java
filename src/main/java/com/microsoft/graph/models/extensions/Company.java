// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Account;
import com.microsoft.graph.models.extensions.AgedAccountsPayable;
import com.microsoft.graph.models.extensions.AgedAccountsReceivable;
import com.microsoft.graph.models.extensions.CompanyInformation;
import com.microsoft.graph.models.extensions.CountryRegion;
import com.microsoft.graph.models.extensions.Currency;
import com.microsoft.graph.models.extensions.CustomerPaymentJournal;
import com.microsoft.graph.models.extensions.CustomerPayment;
import com.microsoft.graph.models.extensions.Customer;
import com.microsoft.graph.models.extensions.Dimension;
import com.microsoft.graph.models.extensions.DimensionValue;
import com.microsoft.graph.models.extensions.Employee;
import com.microsoft.graph.models.extensions.GeneralLedgerEntry;
import com.microsoft.graph.models.extensions.ItemCategory;
import com.microsoft.graph.models.extensions.Item;
import com.microsoft.graph.models.extensions.JournalLine;
import com.microsoft.graph.models.extensions.Journal;
import com.microsoft.graph.models.extensions.PaymentMethod;
import com.microsoft.graph.models.extensions.PaymentTerm;
import com.microsoft.graph.models.extensions.Picture;
import com.microsoft.graph.models.extensions.PurchaseInvoiceLine;
import com.microsoft.graph.models.extensions.PurchaseInvoice;
import com.microsoft.graph.models.extensions.SalesCreditMemoLine;
import com.microsoft.graph.models.extensions.SalesCreditMemo;
import com.microsoft.graph.models.extensions.SalesInvoiceLine;
import com.microsoft.graph.models.extensions.SalesInvoice;
import com.microsoft.graph.models.extensions.SalesOrderLine;
import com.microsoft.graph.models.extensions.SalesOrder;
import com.microsoft.graph.models.extensions.SalesQuoteLine;
import com.microsoft.graph.models.extensions.SalesQuote;
import com.microsoft.graph.models.extensions.ShipmentMethod;
import com.microsoft.graph.models.extensions.TaxArea;
import com.microsoft.graph.models.extensions.TaxGroup;
import com.microsoft.graph.models.extensions.UnitOfMeasure;
import com.microsoft.graph.models.extensions.Vendor;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccountCollectionPage;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableCollectionPage;
import com.microsoft.graph.requests.extensions.AgedAccountsReceivableCollectionPage;
import com.microsoft.graph.requests.extensions.CompanyInformationCollectionPage;
import com.microsoft.graph.requests.extensions.CountryRegionCollectionPage;
import com.microsoft.graph.requests.extensions.CurrencyCollectionPage;
import com.microsoft.graph.requests.extensions.CustomerPaymentJournalCollectionPage;
import com.microsoft.graph.requests.extensions.CustomerPaymentCollectionPage;
import com.microsoft.graph.requests.extensions.CustomerCollectionPage;
import com.microsoft.graph.requests.extensions.DimensionCollectionPage;
import com.microsoft.graph.requests.extensions.DimensionValueCollectionPage;
import com.microsoft.graph.requests.extensions.EmployeeCollectionPage;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryCollectionPage;
import com.microsoft.graph.requests.extensions.ItemCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.ItemCollectionPage;
import com.microsoft.graph.requests.extensions.JournalLineCollectionPage;
import com.microsoft.graph.requests.extensions.JournalCollectionPage;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionPage;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionPage;
import com.microsoft.graph.requests.extensions.PictureCollectionPage;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineCollectionPage;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionPage;
import com.microsoft.graph.requests.extensions.SalesCreditMemoLineCollectionPage;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionPage;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineCollectionPage;
import com.microsoft.graph.requests.extensions.SalesInvoiceCollectionPage;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionPage;
import com.microsoft.graph.requests.extensions.SalesOrderCollectionPage;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionPage;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionPage;
import com.microsoft.graph.requests.extensions.ShipmentMethodCollectionPage;
import com.microsoft.graph.requests.extensions.TaxAreaCollectionPage;
import com.microsoft.graph.requests.extensions.TaxGroupCollectionPage;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionPage;
import com.microsoft.graph.requests.extensions.VendorCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company.
 */
public class Company extends Entity implements IJsonBackedObject {


    /**
     * The Business Profile Id.
     * 
     */
    @SerializedName("businessProfileId")
    @Expose
    public String businessProfileId;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The System Version.
     * 
     */
    @SerializedName("systemVersion")
    @Expose
    public String systemVersion;

    /**
     * The Accounts.
     * 
     */
    @SerializedName("accounts")
    @Expose
    public AccountCollectionPage accounts;

    /**
     * The Aged Accounts Payable.
     * 
     */
    @SerializedName("agedAccountsPayable")
    @Expose
    public AgedAccountsPayableCollectionPage agedAccountsPayable;

    /**
     * The Aged Accounts Receivable.
     * 
     */
    @SerializedName("agedAccountsReceivable")
    @Expose
    public AgedAccountsReceivableCollectionPage agedAccountsReceivable;

    /**
     * The Company Information.
     * 
     */
    @SerializedName("companyInformation")
    @Expose
    public CompanyInformationCollectionPage companyInformation;

    /**
     * The Countries Regions.
     * 
     */
    @SerializedName("countriesRegions")
    @Expose
    public CountryRegionCollectionPage countriesRegions;

    /**
     * The Currencies.
     * 
     */
    @SerializedName("currencies")
    @Expose
    public CurrencyCollectionPage currencies;

    /**
     * The Customer Payment Journals.
     * 
     */
    @SerializedName("customerPaymentJournals")
    @Expose
    public CustomerPaymentJournalCollectionPage customerPaymentJournals;

    /**
     * The Customer Payments.
     * 
     */
    @SerializedName("customerPayments")
    @Expose
    public CustomerPaymentCollectionPage customerPayments;

    /**
     * The Customers.
     * 
     */
    @SerializedName("customers")
    @Expose
    public CustomerCollectionPage customers;

    /**
     * The Dimensions.
     * 
     */
    @SerializedName("dimensions")
    @Expose
    public DimensionCollectionPage dimensions;

    /**
     * The Dimension Values.
     * 
     */
    @SerializedName("dimensionValues")
    @Expose
    public DimensionValueCollectionPage dimensionValues;

    /**
     * The Employees.
     * 
     */
    @SerializedName("employees")
    @Expose
    public EmployeeCollectionPage employees;

    /**
     * The General Ledger Entries.
     * 
     */
    @SerializedName("generalLedgerEntries")
    @Expose
    public GeneralLedgerEntryCollectionPage generalLedgerEntries;

    /**
     * The Item Categories.
     * 
     */
    @SerializedName("itemCategories")
    @Expose
    public ItemCategoryCollectionPage itemCategories;

    /**
     * The Items.
     * 
     */
    @SerializedName("items")
    @Expose
    public ItemCollectionPage items;

    /**
     * The Journal Lines.
     * 
     */
    @SerializedName("journalLines")
    @Expose
    public JournalLineCollectionPage journalLines;

    /**
     * The Journals.
     * 
     */
    @SerializedName("journals")
    @Expose
    public JournalCollectionPage journals;

    /**
     * The Payment Methods.
     * 
     */
    @SerializedName("paymentMethods")
    @Expose
    public PaymentMethodCollectionPage paymentMethods;

    /**
     * The Payment Terms.
     * 
     */
    @SerializedName("paymentTerms")
    @Expose
    public PaymentTermCollectionPage paymentTerms;

    /**
     * The Picture.
     * 
     */
    @SerializedName("picture")
    @Expose
    public PictureCollectionPage picture;

    /**
     * The Purchase Invoice Lines.
     * 
     */
    @SerializedName("purchaseInvoiceLines")
    @Expose
    public PurchaseInvoiceLineCollectionPage purchaseInvoiceLines;

    /**
     * The Purchase Invoices.
     * 
     */
    @SerializedName("purchaseInvoices")
    @Expose
    public PurchaseInvoiceCollectionPage purchaseInvoices;

    /**
     * The Sales Credit Memo Lines.
     * 
     */
    @SerializedName("salesCreditMemoLines")
    @Expose
    public SalesCreditMemoLineCollectionPage salesCreditMemoLines;

    /**
     * The Sales Credit Memos.
     * 
     */
    @SerializedName("salesCreditMemos")
    @Expose
    public SalesCreditMemoCollectionPage salesCreditMemos;

    /**
     * The Sales Invoice Lines.
     * 
     */
    @SerializedName("salesInvoiceLines")
    @Expose
    public SalesInvoiceLineCollectionPage salesInvoiceLines;

    /**
     * The Sales Invoices.
     * 
     */
    @SerializedName("salesInvoices")
    @Expose
    public SalesInvoiceCollectionPage salesInvoices;

    /**
     * The Sales Order Lines.
     * 
     */
    @SerializedName("salesOrderLines")
    @Expose
    public SalesOrderLineCollectionPage salesOrderLines;

    /**
     * The Sales Orders.
     * 
     */
    @SerializedName("salesOrders")
    @Expose
    public SalesOrderCollectionPage salesOrders;

    /**
     * The Sales Quote Lines.
     * 
     */
    @SerializedName("salesQuoteLines")
    @Expose
    public SalesQuoteLineCollectionPage salesQuoteLines;

    /**
     * The Sales Quotes.
     * 
     */
    @SerializedName("salesQuotes")
    @Expose
    public SalesQuoteCollectionPage salesQuotes;

    /**
     * The Shipment Methods.
     * 
     */
    @SerializedName("shipmentMethods")
    @Expose
    public ShipmentMethodCollectionPage shipmentMethods;

    /**
     * The Tax Areas.
     * 
     */
    @SerializedName("taxAreas")
    @Expose
    public TaxAreaCollectionPage taxAreas;

    /**
     * The Tax Groups.
     * 
     */
    @SerializedName("taxGroups")
    @Expose
    public TaxGroupCollectionPage taxGroups;

    /**
     * The Units Of Measure.
     * 
     */
    @SerializedName("unitsOfMeasure")
    @Expose
    public UnitOfMeasureCollectionPage unitsOfMeasure;

    /**
     * The Vendors.
     * 
     */
    @SerializedName("vendors")
    @Expose
    public VendorCollectionPage vendors;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("accounts")) {
            accounts = serializer.deserializeObject(json.get("accounts").toString(), AccountCollectionPage.class);
        }

        if (json.has("agedAccountsPayable")) {
            agedAccountsPayable = serializer.deserializeObject(json.get("agedAccountsPayable").toString(), AgedAccountsPayableCollectionPage.class);
        }

        if (json.has("agedAccountsReceivable")) {
            agedAccountsReceivable = serializer.deserializeObject(json.get("agedAccountsReceivable").toString(), AgedAccountsReceivableCollectionPage.class);
        }

        if (json.has("companyInformation")) {
            companyInformation = serializer.deserializeObject(json.get("companyInformation").toString(), CompanyInformationCollectionPage.class);
        }

        if (json.has("countriesRegions")) {
            countriesRegions = serializer.deserializeObject(json.get("countriesRegions").toString(), CountryRegionCollectionPage.class);
        }

        if (json.has("currencies")) {
            currencies = serializer.deserializeObject(json.get("currencies").toString(), CurrencyCollectionPage.class);
        }

        if (json.has("customerPaymentJournals")) {
            customerPaymentJournals = serializer.deserializeObject(json.get("customerPaymentJournals").toString(), CustomerPaymentJournalCollectionPage.class);
        }

        if (json.has("customerPayments")) {
            customerPayments = serializer.deserializeObject(json.get("customerPayments").toString(), CustomerPaymentCollectionPage.class);
        }

        if (json.has("customers")) {
            customers = serializer.deserializeObject(json.get("customers").toString(), CustomerCollectionPage.class);
        }

        if (json.has("dimensions")) {
            dimensions = serializer.deserializeObject(json.get("dimensions").toString(), DimensionCollectionPage.class);
        }

        if (json.has("dimensionValues")) {
            dimensionValues = serializer.deserializeObject(json.get("dimensionValues").toString(), DimensionValueCollectionPage.class);
        }

        if (json.has("employees")) {
            employees = serializer.deserializeObject(json.get("employees").toString(), EmployeeCollectionPage.class);
        }

        if (json.has("generalLedgerEntries")) {
            generalLedgerEntries = serializer.deserializeObject(json.get("generalLedgerEntries").toString(), GeneralLedgerEntryCollectionPage.class);
        }

        if (json.has("itemCategories")) {
            itemCategories = serializer.deserializeObject(json.get("itemCategories").toString(), ItemCategoryCollectionPage.class);
        }

        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items").toString(), ItemCollectionPage.class);
        }

        if (json.has("journalLines")) {
            journalLines = serializer.deserializeObject(json.get("journalLines").toString(), JournalLineCollectionPage.class);
        }

        if (json.has("journals")) {
            journals = serializer.deserializeObject(json.get("journals").toString(), JournalCollectionPage.class);
        }

        if (json.has("paymentMethods")) {
            paymentMethods = serializer.deserializeObject(json.get("paymentMethods").toString(), PaymentMethodCollectionPage.class);
        }

        if (json.has("paymentTerms")) {
            paymentTerms = serializer.deserializeObject(json.get("paymentTerms").toString(), PaymentTermCollectionPage.class);
        }

        if (json.has("picture")) {
            picture = serializer.deserializeObject(json.get("picture").toString(), PictureCollectionPage.class);
        }

        if (json.has("purchaseInvoiceLines")) {
            purchaseInvoiceLines = serializer.deserializeObject(json.get("purchaseInvoiceLines").toString(), PurchaseInvoiceLineCollectionPage.class);
        }

        if (json.has("purchaseInvoices")) {
            purchaseInvoices = serializer.deserializeObject(json.get("purchaseInvoices").toString(), PurchaseInvoiceCollectionPage.class);
        }

        if (json.has("salesCreditMemoLines")) {
            salesCreditMemoLines = serializer.deserializeObject(json.get("salesCreditMemoLines").toString(), SalesCreditMemoLineCollectionPage.class);
        }

        if (json.has("salesCreditMemos")) {
            salesCreditMemos = serializer.deserializeObject(json.get("salesCreditMemos").toString(), SalesCreditMemoCollectionPage.class);
        }

        if (json.has("salesInvoiceLines")) {
            salesInvoiceLines = serializer.deserializeObject(json.get("salesInvoiceLines").toString(), SalesInvoiceLineCollectionPage.class);
        }

        if (json.has("salesInvoices")) {
            salesInvoices = serializer.deserializeObject(json.get("salesInvoices").toString(), SalesInvoiceCollectionPage.class);
        }

        if (json.has("salesOrderLines")) {
            salesOrderLines = serializer.deserializeObject(json.get("salesOrderLines").toString(), SalesOrderLineCollectionPage.class);
        }

        if (json.has("salesOrders")) {
            salesOrders = serializer.deserializeObject(json.get("salesOrders").toString(), SalesOrderCollectionPage.class);
        }

        if (json.has("salesQuoteLines")) {
            salesQuoteLines = serializer.deserializeObject(json.get("salesQuoteLines").toString(), SalesQuoteLineCollectionPage.class);
        }

        if (json.has("salesQuotes")) {
            salesQuotes = serializer.deserializeObject(json.get("salesQuotes").toString(), SalesQuoteCollectionPage.class);
        }

        if (json.has("shipmentMethods")) {
            shipmentMethods = serializer.deserializeObject(json.get("shipmentMethods").toString(), ShipmentMethodCollectionPage.class);
        }

        if (json.has("taxAreas")) {
            taxAreas = serializer.deserializeObject(json.get("taxAreas").toString(), TaxAreaCollectionPage.class);
        }

        if (json.has("taxGroups")) {
            taxGroups = serializer.deserializeObject(json.get("taxGroups").toString(), TaxGroupCollectionPage.class);
        }

        if (json.has("unitsOfMeasure")) {
            unitsOfMeasure = serializer.deserializeObject(json.get("unitsOfMeasure").toString(), UnitOfMeasureCollectionPage.class);
        }

        if (json.has("vendors")) {
            vendors = serializer.deserializeObject(json.get("vendors").toString(), VendorCollectionPage.class);
        }
    }
}
