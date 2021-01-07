// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
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
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company.
 */
public class Company extends Entity implements IJsonBackedObject {


    /**
     * The Business Profile Id.
     * 
     */
    @SerializedName(value = "businessProfileId", alternate = {"BusinessProfileId"})
    @Expose
	@Nullable
    public String businessProfileId;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The System Version.
     * 
     */
    @SerializedName(value = "systemVersion", alternate = {"SystemVersion"})
    @Expose
	@Nullable
    public String systemVersion;

    /**
     * The Accounts.
     * 
     */
    @SerializedName(value = "accounts", alternate = {"Accounts"})
    @Expose
	@Nullable
    public AccountCollectionPage accounts;

    /**
     * The Aged Accounts Payable.
     * 
     */
    @SerializedName(value = "agedAccountsPayable", alternate = {"AgedAccountsPayable"})
    @Expose
	@Nullable
    public AgedAccountsPayableCollectionPage agedAccountsPayable;

    /**
     * The Aged Accounts Receivable.
     * 
     */
    @SerializedName(value = "agedAccountsReceivable", alternate = {"AgedAccountsReceivable"})
    @Expose
	@Nullable
    public AgedAccountsReceivableCollectionPage agedAccountsReceivable;

    /**
     * The Company Information.
     * 
     */
    @SerializedName(value = "companyInformation", alternate = {"CompanyInformation"})
    @Expose
	@Nullable
    public CompanyInformationCollectionPage companyInformation;

    /**
     * The Countries Regions.
     * 
     */
    @SerializedName(value = "countriesRegions", alternate = {"CountriesRegions"})
    @Expose
	@Nullable
    public CountryRegionCollectionPage countriesRegions;

    /**
     * The Currencies.
     * 
     */
    @SerializedName(value = "currencies", alternate = {"Currencies"})
    @Expose
	@Nullable
    public CurrencyCollectionPage currencies;

    /**
     * The Customer Payment Journals.
     * 
     */
    @SerializedName(value = "customerPaymentJournals", alternate = {"CustomerPaymentJournals"})
    @Expose
	@Nullable
    public CustomerPaymentJournalCollectionPage customerPaymentJournals;

    /**
     * The Customer Payments.
     * 
     */
    @SerializedName(value = "customerPayments", alternate = {"CustomerPayments"})
    @Expose
	@Nullable
    public CustomerPaymentCollectionPage customerPayments;

    /**
     * The Customers.
     * 
     */
    @SerializedName(value = "customers", alternate = {"Customers"})
    @Expose
	@Nullable
    public CustomerCollectionPage customers;

    /**
     * The Dimensions.
     * 
     */
    @SerializedName(value = "dimensions", alternate = {"Dimensions"})
    @Expose
	@Nullable
    public DimensionCollectionPage dimensions;

    /**
     * The Dimension Values.
     * 
     */
    @SerializedName(value = "dimensionValues", alternate = {"DimensionValues"})
    @Expose
	@Nullable
    public DimensionValueCollectionPage dimensionValues;

    /**
     * The Employees.
     * 
     */
    @SerializedName(value = "employees", alternate = {"Employees"})
    @Expose
	@Nullable
    public EmployeeCollectionPage employees;

    /**
     * The General Ledger Entries.
     * 
     */
    @SerializedName(value = "generalLedgerEntries", alternate = {"GeneralLedgerEntries"})
    @Expose
	@Nullable
    public GeneralLedgerEntryCollectionPage generalLedgerEntries;

    /**
     * The Item Categories.
     * 
     */
    @SerializedName(value = "itemCategories", alternate = {"ItemCategories"})
    @Expose
	@Nullable
    public ItemCategoryCollectionPage itemCategories;

    /**
     * The Items.
     * 
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
	@Nullable
    public ItemCollectionPage items;

    /**
     * The Journal Lines.
     * 
     */
    @SerializedName(value = "journalLines", alternate = {"JournalLines"})
    @Expose
	@Nullable
    public JournalLineCollectionPage journalLines;

    /**
     * The Journals.
     * 
     */
    @SerializedName(value = "journals", alternate = {"Journals"})
    @Expose
	@Nullable
    public JournalCollectionPage journals;

    /**
     * The Payment Methods.
     * 
     */
    @SerializedName(value = "paymentMethods", alternate = {"PaymentMethods"})
    @Expose
	@Nullable
    public PaymentMethodCollectionPage paymentMethods;

    /**
     * The Payment Terms.
     * 
     */
    @SerializedName(value = "paymentTerms", alternate = {"PaymentTerms"})
    @Expose
	@Nullable
    public PaymentTermCollectionPage paymentTerms;

    /**
     * The Picture.
     * 
     */
    @SerializedName(value = "picture", alternate = {"Picture"})
    @Expose
	@Nullable
    public PictureCollectionPage picture;

    /**
     * The Purchase Invoice Lines.
     * 
     */
    @SerializedName(value = "purchaseInvoiceLines", alternate = {"PurchaseInvoiceLines"})
    @Expose
	@Nullable
    public PurchaseInvoiceLineCollectionPage purchaseInvoiceLines;

    /**
     * The Purchase Invoices.
     * 
     */
    @SerializedName(value = "purchaseInvoices", alternate = {"PurchaseInvoices"})
    @Expose
	@Nullable
    public PurchaseInvoiceCollectionPage purchaseInvoices;

    /**
     * The Sales Credit Memo Lines.
     * 
     */
    @SerializedName(value = "salesCreditMemoLines", alternate = {"SalesCreditMemoLines"})
    @Expose
	@Nullable
    public SalesCreditMemoLineCollectionPage salesCreditMemoLines;

    /**
     * The Sales Credit Memos.
     * 
     */
    @SerializedName(value = "salesCreditMemos", alternate = {"SalesCreditMemos"})
    @Expose
	@Nullable
    public SalesCreditMemoCollectionPage salesCreditMemos;

    /**
     * The Sales Invoice Lines.
     * 
     */
    @SerializedName(value = "salesInvoiceLines", alternate = {"SalesInvoiceLines"})
    @Expose
	@Nullable
    public SalesInvoiceLineCollectionPage salesInvoiceLines;

    /**
     * The Sales Invoices.
     * 
     */
    @SerializedName(value = "salesInvoices", alternate = {"SalesInvoices"})
    @Expose
	@Nullable
    public SalesInvoiceCollectionPage salesInvoices;

    /**
     * The Sales Order Lines.
     * 
     */
    @SerializedName(value = "salesOrderLines", alternate = {"SalesOrderLines"})
    @Expose
	@Nullable
    public SalesOrderLineCollectionPage salesOrderLines;

    /**
     * The Sales Orders.
     * 
     */
    @SerializedName(value = "salesOrders", alternate = {"SalesOrders"})
    @Expose
	@Nullable
    public SalesOrderCollectionPage salesOrders;

    /**
     * The Sales Quote Lines.
     * 
     */
    @SerializedName(value = "salesQuoteLines", alternate = {"SalesQuoteLines"})
    @Expose
	@Nullable
    public SalesQuoteLineCollectionPage salesQuoteLines;

    /**
     * The Sales Quotes.
     * 
     */
    @SerializedName(value = "salesQuotes", alternate = {"SalesQuotes"})
    @Expose
	@Nullable
    public SalesQuoteCollectionPage salesQuotes;

    /**
     * The Shipment Methods.
     * 
     */
    @SerializedName(value = "shipmentMethods", alternate = {"ShipmentMethods"})
    @Expose
	@Nullable
    public ShipmentMethodCollectionPage shipmentMethods;

    /**
     * The Tax Areas.
     * 
     */
    @SerializedName(value = "taxAreas", alternate = {"TaxAreas"})
    @Expose
	@Nullable
    public TaxAreaCollectionPage taxAreas;

    /**
     * The Tax Groups.
     * 
     */
    @SerializedName(value = "taxGroups", alternate = {"TaxGroups"})
    @Expose
	@Nullable
    public TaxGroupCollectionPage taxGroups;

    /**
     * The Units Of Measure.
     * 
     */
    @SerializedName(value = "unitsOfMeasure", alternate = {"UnitsOfMeasure"})
    @Expose
	@Nullable
    public UnitOfMeasureCollectionPage unitsOfMeasure;

    /**
     * The Vendors.
     * 
     */
    @SerializedName(value = "vendors", alternate = {"Vendors"})
    @Expose
	@Nullable
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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
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
