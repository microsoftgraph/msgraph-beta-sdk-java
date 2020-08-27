// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Item;
import com.microsoft.graph.models.extensions.Customer;
import com.microsoft.graph.models.extensions.Vendor;
import com.microsoft.graph.models.extensions.CompanyInformation;
import com.microsoft.graph.models.extensions.SalesInvoice;
import com.microsoft.graph.models.extensions.SalesInvoiceLine;
import com.microsoft.graph.models.extensions.CustomerPaymentJournal;
import com.microsoft.graph.models.extensions.CustomerPayment;
import com.microsoft.graph.models.extensions.Account;
import com.microsoft.graph.models.extensions.TaxGroup;
import com.microsoft.graph.models.extensions.Journal;
import com.microsoft.graph.models.extensions.JournalLine;
import com.microsoft.graph.models.extensions.Employee;
import com.microsoft.graph.models.extensions.GeneralLedgerEntry;
import com.microsoft.graph.models.extensions.Currency;
import com.microsoft.graph.models.extensions.PaymentMethod;
import com.microsoft.graph.models.extensions.Dimension;
import com.microsoft.graph.models.extensions.DimensionValue;
import com.microsoft.graph.models.extensions.PaymentTerm;
import com.microsoft.graph.models.extensions.ShipmentMethod;
import com.microsoft.graph.models.extensions.ItemCategory;
import com.microsoft.graph.models.extensions.CountryRegion;
import com.microsoft.graph.models.extensions.SalesOrder;
import com.microsoft.graph.models.extensions.SalesOrderLine;
import com.microsoft.graph.models.extensions.UnitOfMeasure;
import com.microsoft.graph.models.extensions.AgedAccountsReceivable;
import com.microsoft.graph.models.extensions.AgedAccountsPayable;
import com.microsoft.graph.models.extensions.TaxArea;
import com.microsoft.graph.models.extensions.SalesQuote;
import com.microsoft.graph.models.extensions.SalesQuoteLine;
import com.microsoft.graph.models.extensions.SalesCreditMemo;
import com.microsoft.graph.models.extensions.SalesCreditMemoLine;
import com.microsoft.graph.models.extensions.PurchaseInvoice;
import com.microsoft.graph.models.extensions.PurchaseInvoiceLine;
import com.microsoft.graph.models.extensions.Picture;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ItemCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemCollectionPage;
import com.microsoft.graph.requests.extensions.CustomerCollectionResponse;
import com.microsoft.graph.requests.extensions.CustomerCollectionPage;
import com.microsoft.graph.requests.extensions.VendorCollectionResponse;
import com.microsoft.graph.requests.extensions.VendorCollectionPage;
import com.microsoft.graph.requests.extensions.CompanyInformationCollectionResponse;
import com.microsoft.graph.requests.extensions.CompanyInformationCollectionPage;
import com.microsoft.graph.requests.extensions.SalesInvoiceCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesInvoiceCollectionPage;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineCollectionPage;
import com.microsoft.graph.requests.extensions.CustomerPaymentJournalCollectionResponse;
import com.microsoft.graph.requests.extensions.CustomerPaymentJournalCollectionPage;
import com.microsoft.graph.requests.extensions.CustomerPaymentCollectionResponse;
import com.microsoft.graph.requests.extensions.CustomerPaymentCollectionPage;
import com.microsoft.graph.requests.extensions.AccountCollectionResponse;
import com.microsoft.graph.requests.extensions.AccountCollectionPage;
import com.microsoft.graph.requests.extensions.TaxGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.TaxGroupCollectionPage;
import com.microsoft.graph.requests.extensions.JournalCollectionResponse;
import com.microsoft.graph.requests.extensions.JournalCollectionPage;
import com.microsoft.graph.requests.extensions.JournalLineCollectionResponse;
import com.microsoft.graph.requests.extensions.JournalLineCollectionPage;
import com.microsoft.graph.requests.extensions.EmployeeCollectionResponse;
import com.microsoft.graph.requests.extensions.EmployeeCollectionPage;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryCollectionResponse;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryCollectionPage;
import com.microsoft.graph.requests.extensions.CurrencyCollectionResponse;
import com.microsoft.graph.requests.extensions.CurrencyCollectionPage;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionPage;
import com.microsoft.graph.requests.extensions.DimensionCollectionResponse;
import com.microsoft.graph.requests.extensions.DimensionCollectionPage;
import com.microsoft.graph.requests.extensions.DimensionValueCollectionResponse;
import com.microsoft.graph.requests.extensions.DimensionValueCollectionPage;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionResponse;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionPage;
import com.microsoft.graph.requests.extensions.ShipmentMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.ShipmentMethodCollectionPage;
import com.microsoft.graph.requests.extensions.ItemCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.CountryRegionCollectionResponse;
import com.microsoft.graph.requests.extensions.CountryRegionCollectionPage;
import com.microsoft.graph.requests.extensions.SalesOrderCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesOrderCollectionPage;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionPage;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionResponse;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionPage;
import com.microsoft.graph.requests.extensions.AgedAccountsReceivableCollectionResponse;
import com.microsoft.graph.requests.extensions.AgedAccountsReceivableCollectionPage;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableCollectionResponse;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableCollectionPage;
import com.microsoft.graph.requests.extensions.TaxAreaCollectionResponse;
import com.microsoft.graph.requests.extensions.TaxAreaCollectionPage;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionPage;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionPage;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionPage;
import com.microsoft.graph.requests.extensions.SalesCreditMemoLineCollectionResponse;
import com.microsoft.graph.requests.extensions.SalesCreditMemoLineCollectionPage;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionResponse;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionPage;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineCollectionResponse;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineCollectionPage;
import com.microsoft.graph.requests.extensions.PictureCollectionResponse;
import com.microsoft.graph.requests.extensions.PictureCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company.
 */
public class Company extends Entity implements IJsonBackedObject {


    /**
     * The System Version.
     * 
     */
    @SerializedName("systemVersion")
    @Expose
    public String systemVersion;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Business Profile Id.
     * 
     */
    @SerializedName("businessProfileId")
    @Expose
    public String businessProfileId;

    /**
     * The Items.
     * 
     */
    public ItemCollectionPage items;

    /**
     * The Customers.
     * 
     */
    public CustomerCollectionPage customers;

    /**
     * The Vendors.
     * 
     */
    public VendorCollectionPage vendors;

    /**
     * The Company Information.
     * 
     */
    public CompanyInformationCollectionPage companyInformation;

    /**
     * The Sales Invoices.
     * 
     */
    public SalesInvoiceCollectionPage salesInvoices;

    /**
     * The Sales Invoice Lines.
     * 
     */
    public SalesInvoiceLineCollectionPage salesInvoiceLines;

    /**
     * The Customer Payment Journals.
     * 
     */
    public CustomerPaymentJournalCollectionPage customerPaymentJournals;

    /**
     * The Customer Payments.
     * 
     */
    public CustomerPaymentCollectionPage customerPayments;

    /**
     * The Accounts.
     * 
     */
    public AccountCollectionPage accounts;

    /**
     * The Tax Groups.
     * 
     */
    public TaxGroupCollectionPage taxGroups;

    /**
     * The Journals.
     * 
     */
    public JournalCollectionPage journals;

    /**
     * The Journal Lines.
     * 
     */
    public JournalLineCollectionPage journalLines;

    /**
     * The Employees.
     * 
     */
    public EmployeeCollectionPage employees;

    /**
     * The General Ledger Entries.
     * 
     */
    public GeneralLedgerEntryCollectionPage generalLedgerEntries;

    /**
     * The Currencies.
     * 
     */
    public CurrencyCollectionPage currencies;

    /**
     * The Payment Methods.
     * 
     */
    public PaymentMethodCollectionPage paymentMethods;

    /**
     * The Dimensions.
     * 
     */
    public DimensionCollectionPage dimensions;

    /**
     * The Dimension Values.
     * 
     */
    public DimensionValueCollectionPage dimensionValues;

    /**
     * The Payment Terms.
     * 
     */
    public PaymentTermCollectionPage paymentTerms;

    /**
     * The Shipment Methods.
     * 
     */
    public ShipmentMethodCollectionPage shipmentMethods;

    /**
     * The Item Categories.
     * 
     */
    public ItemCategoryCollectionPage itemCategories;

    /**
     * The Countries Regions.
     * 
     */
    public CountryRegionCollectionPage countriesRegions;

    /**
     * The Sales Orders.
     * 
     */
    public SalesOrderCollectionPage salesOrders;

    /**
     * The Sales Order Lines.
     * 
     */
    public SalesOrderLineCollectionPage salesOrderLines;

    /**
     * The Units Of Measure.
     * 
     */
    public UnitOfMeasureCollectionPage unitsOfMeasure;

    /**
     * The Aged Accounts Receivable.
     * 
     */
    public AgedAccountsReceivableCollectionPage agedAccountsReceivable;

    /**
     * The Aged Accounts Payable.
     * 
     */
    public AgedAccountsPayableCollectionPage agedAccountsPayable;

    /**
     * The Tax Areas.
     * 
     */
    public TaxAreaCollectionPage taxAreas;

    /**
     * The Sales Quotes.
     * 
     */
    public SalesQuoteCollectionPage salesQuotes;

    /**
     * The Sales Quote Lines.
     * 
     */
    public SalesQuoteLineCollectionPage salesQuoteLines;

    /**
     * The Sales Credit Memos.
     * 
     */
    public SalesCreditMemoCollectionPage salesCreditMemos;

    /**
     * The Sales Credit Memo Lines.
     * 
     */
    public SalesCreditMemoLineCollectionPage salesCreditMemoLines;

    /**
     * The Purchase Invoices.
     * 
     */
    public PurchaseInvoiceCollectionPage purchaseInvoices;

    /**
     * The Purchase Invoice Lines.
     * 
     */
    public PurchaseInvoiceLineCollectionPage purchaseInvoiceLines;

    /**
     * The Picture.
     * 
     */
    public PictureCollectionPage picture;


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


        if (json.has("items")) {
            final ItemCollectionResponse response = new ItemCollectionResponse();
            if (json.has("items@odata.nextLink")) {
                response.nextLink = json.get("items@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("items").toString(), JsonObject[].class);
            final Item[] array = new Item[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Item.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            items = new ItemCollectionPage(response, null);
        }

        if (json.has("customers")) {
            final CustomerCollectionResponse response = new CustomerCollectionResponse();
            if (json.has("customers@odata.nextLink")) {
                response.nextLink = json.get("customers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("customers").toString(), JsonObject[].class);
            final Customer[] array = new Customer[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Customer.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            customers = new CustomerCollectionPage(response, null);
        }

        if (json.has("vendors")) {
            final VendorCollectionResponse response = new VendorCollectionResponse();
            if (json.has("vendors@odata.nextLink")) {
                response.nextLink = json.get("vendors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("vendors").toString(), JsonObject[].class);
            final Vendor[] array = new Vendor[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Vendor.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            vendors = new VendorCollectionPage(response, null);
        }

        if (json.has("companyInformation")) {
            final CompanyInformationCollectionResponse response = new CompanyInformationCollectionResponse();
            if (json.has("companyInformation@odata.nextLink")) {
                response.nextLink = json.get("companyInformation@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("companyInformation").toString(), JsonObject[].class);
            final CompanyInformation[] array = new CompanyInformation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CompanyInformation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            companyInformation = new CompanyInformationCollectionPage(response, null);
        }

        if (json.has("salesInvoices")) {
            final SalesInvoiceCollectionResponse response = new SalesInvoiceCollectionResponse();
            if (json.has("salesInvoices@odata.nextLink")) {
                response.nextLink = json.get("salesInvoices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesInvoices").toString(), JsonObject[].class);
            final SalesInvoice[] array = new SalesInvoice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesInvoice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesInvoices = new SalesInvoiceCollectionPage(response, null);
        }

        if (json.has("salesInvoiceLines")) {
            final SalesInvoiceLineCollectionResponse response = new SalesInvoiceLineCollectionResponse();
            if (json.has("salesInvoiceLines@odata.nextLink")) {
                response.nextLink = json.get("salesInvoiceLines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesInvoiceLines").toString(), JsonObject[].class);
            final SalesInvoiceLine[] array = new SalesInvoiceLine[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesInvoiceLine.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesInvoiceLines = new SalesInvoiceLineCollectionPage(response, null);
        }

        if (json.has("customerPaymentJournals")) {
            final CustomerPaymentJournalCollectionResponse response = new CustomerPaymentJournalCollectionResponse();
            if (json.has("customerPaymentJournals@odata.nextLink")) {
                response.nextLink = json.get("customerPaymentJournals@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("customerPaymentJournals").toString(), JsonObject[].class);
            final CustomerPaymentJournal[] array = new CustomerPaymentJournal[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CustomerPaymentJournal.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            customerPaymentJournals = new CustomerPaymentJournalCollectionPage(response, null);
        }

        if (json.has("customerPayments")) {
            final CustomerPaymentCollectionResponse response = new CustomerPaymentCollectionResponse();
            if (json.has("customerPayments@odata.nextLink")) {
                response.nextLink = json.get("customerPayments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("customerPayments").toString(), JsonObject[].class);
            final CustomerPayment[] array = new CustomerPayment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CustomerPayment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            customerPayments = new CustomerPaymentCollectionPage(response, null);
        }

        if (json.has("accounts")) {
            final AccountCollectionResponse response = new AccountCollectionResponse();
            if (json.has("accounts@odata.nextLink")) {
                response.nextLink = json.get("accounts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("accounts").toString(), JsonObject[].class);
            final Account[] array = new Account[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Account.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            accounts = new AccountCollectionPage(response, null);
        }

        if (json.has("taxGroups")) {
            final TaxGroupCollectionResponse response = new TaxGroupCollectionResponse();
            if (json.has("taxGroups@odata.nextLink")) {
                response.nextLink = json.get("taxGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("taxGroups").toString(), JsonObject[].class);
            final TaxGroup[] array = new TaxGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TaxGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            taxGroups = new TaxGroupCollectionPage(response, null);
        }

        if (json.has("journals")) {
            final JournalCollectionResponse response = new JournalCollectionResponse();
            if (json.has("journals@odata.nextLink")) {
                response.nextLink = json.get("journals@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("journals").toString(), JsonObject[].class);
            final Journal[] array = new Journal[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Journal.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            journals = new JournalCollectionPage(response, null);
        }

        if (json.has("journalLines")) {
            final JournalLineCollectionResponse response = new JournalLineCollectionResponse();
            if (json.has("journalLines@odata.nextLink")) {
                response.nextLink = json.get("journalLines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("journalLines").toString(), JsonObject[].class);
            final JournalLine[] array = new JournalLine[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), JournalLine.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            journalLines = new JournalLineCollectionPage(response, null);
        }

        if (json.has("employees")) {
            final EmployeeCollectionResponse response = new EmployeeCollectionResponse();
            if (json.has("employees@odata.nextLink")) {
                response.nextLink = json.get("employees@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("employees").toString(), JsonObject[].class);
            final Employee[] array = new Employee[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Employee.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            employees = new EmployeeCollectionPage(response, null);
        }

        if (json.has("generalLedgerEntries")) {
            final GeneralLedgerEntryCollectionResponse response = new GeneralLedgerEntryCollectionResponse();
            if (json.has("generalLedgerEntries@odata.nextLink")) {
                response.nextLink = json.get("generalLedgerEntries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("generalLedgerEntries").toString(), JsonObject[].class);
            final GeneralLedgerEntry[] array = new GeneralLedgerEntry[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GeneralLedgerEntry.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            generalLedgerEntries = new GeneralLedgerEntryCollectionPage(response, null);
        }

        if (json.has("currencies")) {
            final CurrencyCollectionResponse response = new CurrencyCollectionResponse();
            if (json.has("currencies@odata.nextLink")) {
                response.nextLink = json.get("currencies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("currencies").toString(), JsonObject[].class);
            final Currency[] array = new Currency[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Currency.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            currencies = new CurrencyCollectionPage(response, null);
        }

        if (json.has("paymentMethods")) {
            final PaymentMethodCollectionResponse response = new PaymentMethodCollectionResponse();
            if (json.has("paymentMethods@odata.nextLink")) {
                response.nextLink = json.get("paymentMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("paymentMethods").toString(), JsonObject[].class);
            final PaymentMethod[] array = new PaymentMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PaymentMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            paymentMethods = new PaymentMethodCollectionPage(response, null);
        }

        if (json.has("dimensions")) {
            final DimensionCollectionResponse response = new DimensionCollectionResponse();
            if (json.has("dimensions@odata.nextLink")) {
                response.nextLink = json.get("dimensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("dimensions").toString(), JsonObject[].class);
            final Dimension[] array = new Dimension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Dimension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            dimensions = new DimensionCollectionPage(response, null);
        }

        if (json.has("dimensionValues")) {
            final DimensionValueCollectionResponse response = new DimensionValueCollectionResponse();
            if (json.has("dimensionValues@odata.nextLink")) {
                response.nextLink = json.get("dimensionValues@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("dimensionValues").toString(), JsonObject[].class);
            final DimensionValue[] array = new DimensionValue[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DimensionValue.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            dimensionValues = new DimensionValueCollectionPage(response, null);
        }

        if (json.has("paymentTerms")) {
            final PaymentTermCollectionResponse response = new PaymentTermCollectionResponse();
            if (json.has("paymentTerms@odata.nextLink")) {
                response.nextLink = json.get("paymentTerms@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("paymentTerms").toString(), JsonObject[].class);
            final PaymentTerm[] array = new PaymentTerm[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PaymentTerm.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            paymentTerms = new PaymentTermCollectionPage(response, null);
        }

        if (json.has("shipmentMethods")) {
            final ShipmentMethodCollectionResponse response = new ShipmentMethodCollectionResponse();
            if (json.has("shipmentMethods@odata.nextLink")) {
                response.nextLink = json.get("shipmentMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("shipmentMethods").toString(), JsonObject[].class);
            final ShipmentMethod[] array = new ShipmentMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ShipmentMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            shipmentMethods = new ShipmentMethodCollectionPage(response, null);
        }

        if (json.has("itemCategories")) {
            final ItemCategoryCollectionResponse response = new ItemCategoryCollectionResponse();
            if (json.has("itemCategories@odata.nextLink")) {
                response.nextLink = json.get("itemCategories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("itemCategories").toString(), JsonObject[].class);
            final ItemCategory[] array = new ItemCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            itemCategories = new ItemCategoryCollectionPage(response, null);
        }

        if (json.has("countriesRegions")) {
            final CountryRegionCollectionResponse response = new CountryRegionCollectionResponse();
            if (json.has("countriesRegions@odata.nextLink")) {
                response.nextLink = json.get("countriesRegions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("countriesRegions").toString(), JsonObject[].class);
            final CountryRegion[] array = new CountryRegion[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CountryRegion.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            countriesRegions = new CountryRegionCollectionPage(response, null);
        }

        if (json.has("salesOrders")) {
            final SalesOrderCollectionResponse response = new SalesOrderCollectionResponse();
            if (json.has("salesOrders@odata.nextLink")) {
                response.nextLink = json.get("salesOrders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesOrders").toString(), JsonObject[].class);
            final SalesOrder[] array = new SalesOrder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesOrder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesOrders = new SalesOrderCollectionPage(response, null);
        }

        if (json.has("salesOrderLines")) {
            final SalesOrderLineCollectionResponse response = new SalesOrderLineCollectionResponse();
            if (json.has("salesOrderLines@odata.nextLink")) {
                response.nextLink = json.get("salesOrderLines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesOrderLines").toString(), JsonObject[].class);
            final SalesOrderLine[] array = new SalesOrderLine[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesOrderLine.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesOrderLines = new SalesOrderLineCollectionPage(response, null);
        }

        if (json.has("unitsOfMeasure")) {
            final UnitOfMeasureCollectionResponse response = new UnitOfMeasureCollectionResponse();
            if (json.has("unitsOfMeasure@odata.nextLink")) {
                response.nextLink = json.get("unitsOfMeasure@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("unitsOfMeasure").toString(), JsonObject[].class);
            final UnitOfMeasure[] array = new UnitOfMeasure[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UnitOfMeasure.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            unitsOfMeasure = new UnitOfMeasureCollectionPage(response, null);
        }

        if (json.has("agedAccountsReceivable")) {
            final AgedAccountsReceivableCollectionResponse response = new AgedAccountsReceivableCollectionResponse();
            if (json.has("agedAccountsReceivable@odata.nextLink")) {
                response.nextLink = json.get("agedAccountsReceivable@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("agedAccountsReceivable").toString(), JsonObject[].class);
            final AgedAccountsReceivable[] array = new AgedAccountsReceivable[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AgedAccountsReceivable.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            agedAccountsReceivable = new AgedAccountsReceivableCollectionPage(response, null);
        }

        if (json.has("agedAccountsPayable")) {
            final AgedAccountsPayableCollectionResponse response = new AgedAccountsPayableCollectionResponse();
            if (json.has("agedAccountsPayable@odata.nextLink")) {
                response.nextLink = json.get("agedAccountsPayable@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("agedAccountsPayable").toString(), JsonObject[].class);
            final AgedAccountsPayable[] array = new AgedAccountsPayable[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AgedAccountsPayable.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            agedAccountsPayable = new AgedAccountsPayableCollectionPage(response, null);
        }

        if (json.has("taxAreas")) {
            final TaxAreaCollectionResponse response = new TaxAreaCollectionResponse();
            if (json.has("taxAreas@odata.nextLink")) {
                response.nextLink = json.get("taxAreas@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("taxAreas").toString(), JsonObject[].class);
            final TaxArea[] array = new TaxArea[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TaxArea.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            taxAreas = new TaxAreaCollectionPage(response, null);
        }

        if (json.has("salesQuotes")) {
            final SalesQuoteCollectionResponse response = new SalesQuoteCollectionResponse();
            if (json.has("salesQuotes@odata.nextLink")) {
                response.nextLink = json.get("salesQuotes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesQuotes").toString(), JsonObject[].class);
            final SalesQuote[] array = new SalesQuote[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesQuote.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesQuotes = new SalesQuoteCollectionPage(response, null);
        }

        if (json.has("salesQuoteLines")) {
            final SalesQuoteLineCollectionResponse response = new SalesQuoteLineCollectionResponse();
            if (json.has("salesQuoteLines@odata.nextLink")) {
                response.nextLink = json.get("salesQuoteLines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesQuoteLines").toString(), JsonObject[].class);
            final SalesQuoteLine[] array = new SalesQuoteLine[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesQuoteLine.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesQuoteLines = new SalesQuoteLineCollectionPage(response, null);
        }

        if (json.has("salesCreditMemos")) {
            final SalesCreditMemoCollectionResponse response = new SalesCreditMemoCollectionResponse();
            if (json.has("salesCreditMemos@odata.nextLink")) {
                response.nextLink = json.get("salesCreditMemos@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesCreditMemos").toString(), JsonObject[].class);
            final SalesCreditMemo[] array = new SalesCreditMemo[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesCreditMemo.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesCreditMemos = new SalesCreditMemoCollectionPage(response, null);
        }

        if (json.has("salesCreditMemoLines")) {
            final SalesCreditMemoLineCollectionResponse response = new SalesCreditMemoLineCollectionResponse();
            if (json.has("salesCreditMemoLines@odata.nextLink")) {
                response.nextLink = json.get("salesCreditMemoLines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("salesCreditMemoLines").toString(), JsonObject[].class);
            final SalesCreditMemoLine[] array = new SalesCreditMemoLine[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SalesCreditMemoLine.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            salesCreditMemoLines = new SalesCreditMemoLineCollectionPage(response, null);
        }

        if (json.has("purchaseInvoices")) {
            final PurchaseInvoiceCollectionResponse response = new PurchaseInvoiceCollectionResponse();
            if (json.has("purchaseInvoices@odata.nextLink")) {
                response.nextLink = json.get("purchaseInvoices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("purchaseInvoices").toString(), JsonObject[].class);
            final PurchaseInvoice[] array = new PurchaseInvoice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PurchaseInvoice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            purchaseInvoices = new PurchaseInvoiceCollectionPage(response, null);
        }

        if (json.has("purchaseInvoiceLines")) {
            final PurchaseInvoiceLineCollectionResponse response = new PurchaseInvoiceLineCollectionResponse();
            if (json.has("purchaseInvoiceLines@odata.nextLink")) {
                response.nextLink = json.get("purchaseInvoiceLines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("purchaseInvoiceLines").toString(), JsonObject[].class);
            final PurchaseInvoiceLine[] array = new PurchaseInvoiceLine[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PurchaseInvoiceLine.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            purchaseInvoiceLines = new PurchaseInvoiceLineCollectionPage(response, null);
        }

        if (json.has("picture")) {
            final PictureCollectionResponse response = new PictureCollectionResponse();
            if (json.has("picture@odata.nextLink")) {
                response.nextLink = json.get("picture@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("picture").toString(), JsonObject[].class);
            final Picture[] array = new Picture[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Picture.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            picture = new PictureCollectionPage(response, null);
        }
    }
}
