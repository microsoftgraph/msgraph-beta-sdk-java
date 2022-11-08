package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the financials singleton. */
public class Company extends Entity implements Parsable {
    /** The accounts property */
    private java.util.List<Account> _accounts;
    /** The agedAccountsPayable property */
    private java.util.List<AgedAccountsPayable> _agedAccountsPayable;
    /** The agedAccountsReceivable property */
    private java.util.List<AgedAccountsReceivable> _agedAccountsReceivable;
    /** The businessProfileId property */
    private String _businessProfileId;
    /** The companyInformation property */
    private java.util.List<CompanyInformation> _companyInformation;
    /** The countriesRegions property */
    private java.util.List<CountryRegion> _countriesRegions;
    /** The currencies property */
    private java.util.List<Currency> _currencies;
    /** The customerPaymentJournals property */
    private java.util.List<CustomerPaymentJournal> _customerPaymentJournals;
    /** The customerPayments property */
    private java.util.List<CustomerPayment> _customerPayments;
    /** The customers property */
    private java.util.List<Customer> _customers;
    /** The dimensions property */
    private java.util.List<Dimension> _dimensions;
    /** The dimensionValues property */
    private java.util.List<DimensionValue> _dimensionValues;
    /** The displayName property */
    private String _displayName;
    /** The employees property */
    private java.util.List<Employee> _employees;
    /** The generalLedgerEntries property */
    private java.util.List<GeneralLedgerEntry> _generalLedgerEntries;
    /** The itemCategories property */
    private java.util.List<ItemCategory> _itemCategories;
    /** The items property */
    private java.util.List<Item> _items;
    /** The journalLines property */
    private java.util.List<JournalLine> _journalLines;
    /** The journals property */
    private java.util.List<Journal> _journals;
    /** The name property */
    private String _name;
    /** The paymentMethods property */
    private java.util.List<PaymentMethod> _paymentMethods;
    /** The paymentTerms property */
    private java.util.List<PaymentTerm> _paymentTerms;
    /** The picture property */
    private java.util.List<Picture> _picture;
    /** The purchaseInvoiceLines property */
    private java.util.List<PurchaseInvoiceLine> _purchaseInvoiceLines;
    /** The purchaseInvoices property */
    private java.util.List<PurchaseInvoice> _purchaseInvoices;
    /** The salesCreditMemoLines property */
    private java.util.List<SalesCreditMemoLine> _salesCreditMemoLines;
    /** The salesCreditMemos property */
    private java.util.List<SalesCreditMemo> _salesCreditMemos;
    /** The salesInvoiceLines property */
    private java.util.List<SalesInvoiceLine> _salesInvoiceLines;
    /** The salesInvoices property */
    private java.util.List<SalesInvoice> _salesInvoices;
    /** The salesOrderLines property */
    private java.util.List<SalesOrderLine> _salesOrderLines;
    /** The salesOrders property */
    private java.util.List<SalesOrder> _salesOrders;
    /** The salesQuoteLines property */
    private java.util.List<SalesQuoteLine> _salesQuoteLines;
    /** The salesQuotes property */
    private java.util.List<SalesQuote> _salesQuotes;
    /** The shipmentMethods property */
    private java.util.List<ShipmentMethod> _shipmentMethods;
    /** The systemVersion property */
    private String _systemVersion;
    /** The taxAreas property */
    private java.util.List<TaxArea> _taxAreas;
    /** The taxGroups property */
    private java.util.List<TaxGroup> _taxGroups;
    /** The unitsOfMeasure property */
    private java.util.List<UnitOfMeasure> _unitsOfMeasure;
    /** The vendors property */
    private java.util.List<Vendor> _vendors;
    /**
     * Instantiates a new company and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Company() {
        super();
        this.setOdataType("#microsoft.graph.company");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a company
     */
    @javax.annotation.Nonnull
    public static Company createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Company();
    }
    /**
     * Gets the accounts property value. The accounts property
     * @return a account
     */
    @javax.annotation.Nullable
    public java.util.List<Account> getAccounts() {
        return this._accounts;
    }
    /**
     * Gets the agedAccountsPayable property value. The agedAccountsPayable property
     * @return a agedAccountsPayable
     */
    @javax.annotation.Nullable
    public java.util.List<AgedAccountsPayable> getAgedAccountsPayable() {
        return this._agedAccountsPayable;
    }
    /**
     * Gets the agedAccountsReceivable property value. The agedAccountsReceivable property
     * @return a agedAccountsReceivable
     */
    @javax.annotation.Nullable
    public java.util.List<AgedAccountsReceivable> getAgedAccountsReceivable() {
        return this._agedAccountsReceivable;
    }
    /**
     * Gets the businessProfileId property value. The businessProfileId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBusinessProfileId() {
        return this._businessProfileId;
    }
    /**
     * Gets the companyInformation property value. The companyInformation property
     * @return a companyInformation
     */
    @javax.annotation.Nullable
    public java.util.List<CompanyInformation> getCompanyInformation() {
        return this._companyInformation;
    }
    /**
     * Gets the countriesRegions property value. The countriesRegions property
     * @return a countryRegion
     */
    @javax.annotation.Nullable
    public java.util.List<CountryRegion> getCountriesRegions() {
        return this._countriesRegions;
    }
    /**
     * Gets the currencies property value. The currencies property
     * @return a currency
     */
    @javax.annotation.Nullable
    public java.util.List<Currency> getCurrencies() {
        return this._currencies;
    }
    /**
     * Gets the customerPaymentJournals property value. The customerPaymentJournals property
     * @return a customerPaymentJournal
     */
    @javax.annotation.Nullable
    public java.util.List<CustomerPaymentJournal> getCustomerPaymentJournals() {
        return this._customerPaymentJournals;
    }
    /**
     * Gets the customerPayments property value. The customerPayments property
     * @return a customerPayment
     */
    @javax.annotation.Nullable
    public java.util.List<CustomerPayment> getCustomerPayments() {
        return this._customerPayments;
    }
    /**
     * Gets the customers property value. The customers property
     * @return a customer
     */
    @javax.annotation.Nullable
    public java.util.List<Customer> getCustomers() {
        return this._customers;
    }
    /**
     * Gets the dimensions property value. The dimensions property
     * @return a dimension
     */
    @javax.annotation.Nullable
    public java.util.List<Dimension> getDimensions() {
        return this._dimensions;
    }
    /**
     * Gets the dimensionValues property value. The dimensionValues property
     * @return a dimensionValue
     */
    @javax.annotation.Nullable
    public java.util.List<DimensionValue> getDimensionValues() {
        return this._dimensionValues;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the employees property value. The employees property
     * @return a employee
     */
    @javax.annotation.Nullable
    public java.util.List<Employee> getEmployees() {
        return this._employees;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Company currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accounts", (n) -> { currentObject.setAccounts(n.getCollectionOfObjectValues(Account::createFromDiscriminatorValue)); });
            this.put("agedAccountsPayable", (n) -> { currentObject.setAgedAccountsPayable(n.getCollectionOfObjectValues(AgedAccountsPayable::createFromDiscriminatorValue)); });
            this.put("agedAccountsReceivable", (n) -> { currentObject.setAgedAccountsReceivable(n.getCollectionOfObjectValues(AgedAccountsReceivable::createFromDiscriminatorValue)); });
            this.put("businessProfileId", (n) -> { currentObject.setBusinessProfileId(n.getStringValue()); });
            this.put("companyInformation", (n) -> { currentObject.setCompanyInformation(n.getCollectionOfObjectValues(CompanyInformation::createFromDiscriminatorValue)); });
            this.put("countriesRegions", (n) -> { currentObject.setCountriesRegions(n.getCollectionOfObjectValues(CountryRegion::createFromDiscriminatorValue)); });
            this.put("currencies", (n) -> { currentObject.setCurrencies(n.getCollectionOfObjectValues(Currency::createFromDiscriminatorValue)); });
            this.put("customerPaymentJournals", (n) -> { currentObject.setCustomerPaymentJournals(n.getCollectionOfObjectValues(CustomerPaymentJournal::createFromDiscriminatorValue)); });
            this.put("customerPayments", (n) -> { currentObject.setCustomerPayments(n.getCollectionOfObjectValues(CustomerPayment::createFromDiscriminatorValue)); });
            this.put("customers", (n) -> { currentObject.setCustomers(n.getCollectionOfObjectValues(Customer::createFromDiscriminatorValue)); });
            this.put("dimensions", (n) -> { currentObject.setDimensions(n.getCollectionOfObjectValues(Dimension::createFromDiscriminatorValue)); });
            this.put("dimensionValues", (n) -> { currentObject.setDimensionValues(n.getCollectionOfObjectValues(DimensionValue::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("employees", (n) -> { currentObject.setEmployees(n.getCollectionOfObjectValues(Employee::createFromDiscriminatorValue)); });
            this.put("generalLedgerEntries", (n) -> { currentObject.setGeneralLedgerEntries(n.getCollectionOfObjectValues(GeneralLedgerEntry::createFromDiscriminatorValue)); });
            this.put("itemCategories", (n) -> { currentObject.setItemCategories(n.getCollectionOfObjectValues(ItemCategory::createFromDiscriminatorValue)); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(Item::createFromDiscriminatorValue)); });
            this.put("journalLines", (n) -> { currentObject.setJournalLines(n.getCollectionOfObjectValues(JournalLine::createFromDiscriminatorValue)); });
            this.put("journals", (n) -> { currentObject.setJournals(n.getCollectionOfObjectValues(Journal::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("paymentMethods", (n) -> { currentObject.setPaymentMethods(n.getCollectionOfObjectValues(PaymentMethod::createFromDiscriminatorValue)); });
            this.put("paymentTerms", (n) -> { currentObject.setPaymentTerms(n.getCollectionOfObjectValues(PaymentTerm::createFromDiscriminatorValue)); });
            this.put("picture", (n) -> { currentObject.setPicture(n.getCollectionOfObjectValues(Picture::createFromDiscriminatorValue)); });
            this.put("purchaseInvoiceLines", (n) -> { currentObject.setPurchaseInvoiceLines(n.getCollectionOfObjectValues(PurchaseInvoiceLine::createFromDiscriminatorValue)); });
            this.put("purchaseInvoices", (n) -> { currentObject.setPurchaseInvoices(n.getCollectionOfObjectValues(PurchaseInvoice::createFromDiscriminatorValue)); });
            this.put("salesCreditMemoLines", (n) -> { currentObject.setSalesCreditMemoLines(n.getCollectionOfObjectValues(SalesCreditMemoLine::createFromDiscriminatorValue)); });
            this.put("salesCreditMemos", (n) -> { currentObject.setSalesCreditMemos(n.getCollectionOfObjectValues(SalesCreditMemo::createFromDiscriminatorValue)); });
            this.put("salesInvoiceLines", (n) -> { currentObject.setSalesInvoiceLines(n.getCollectionOfObjectValues(SalesInvoiceLine::createFromDiscriminatorValue)); });
            this.put("salesInvoices", (n) -> { currentObject.setSalesInvoices(n.getCollectionOfObjectValues(SalesInvoice::createFromDiscriminatorValue)); });
            this.put("salesOrderLines", (n) -> { currentObject.setSalesOrderLines(n.getCollectionOfObjectValues(SalesOrderLine::createFromDiscriminatorValue)); });
            this.put("salesOrders", (n) -> { currentObject.setSalesOrders(n.getCollectionOfObjectValues(SalesOrder::createFromDiscriminatorValue)); });
            this.put("salesQuoteLines", (n) -> { currentObject.setSalesQuoteLines(n.getCollectionOfObjectValues(SalesQuoteLine::createFromDiscriminatorValue)); });
            this.put("salesQuotes", (n) -> { currentObject.setSalesQuotes(n.getCollectionOfObjectValues(SalesQuote::createFromDiscriminatorValue)); });
            this.put("shipmentMethods", (n) -> { currentObject.setShipmentMethods(n.getCollectionOfObjectValues(ShipmentMethod::createFromDiscriminatorValue)); });
            this.put("systemVersion", (n) -> { currentObject.setSystemVersion(n.getStringValue()); });
            this.put("taxAreas", (n) -> { currentObject.setTaxAreas(n.getCollectionOfObjectValues(TaxArea::createFromDiscriminatorValue)); });
            this.put("taxGroups", (n) -> { currentObject.setTaxGroups(n.getCollectionOfObjectValues(TaxGroup::createFromDiscriminatorValue)); });
            this.put("unitsOfMeasure", (n) -> { currentObject.setUnitsOfMeasure(n.getCollectionOfObjectValues(UnitOfMeasure::createFromDiscriminatorValue)); });
            this.put("vendors", (n) -> { currentObject.setVendors(n.getCollectionOfObjectValues(Vendor::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the generalLedgerEntries property value. The generalLedgerEntries property
     * @return a generalLedgerEntry
     */
    @javax.annotation.Nullable
    public java.util.List<GeneralLedgerEntry> getGeneralLedgerEntries() {
        return this._generalLedgerEntries;
    }
    /**
     * Gets the itemCategories property value. The itemCategories property
     * @return a itemCategory
     */
    @javax.annotation.Nullable
    public java.util.List<ItemCategory> getItemCategories() {
        return this._itemCategories;
    }
    /**
     * Gets the items property value. The items property
     * @return a item
     */
    @javax.annotation.Nullable
    public java.util.List<Item> getItems() {
        return this._items;
    }
    /**
     * Gets the journalLines property value. The journalLines property
     * @return a journalLine
     */
    @javax.annotation.Nullable
    public java.util.List<JournalLine> getJournalLines() {
        return this._journalLines;
    }
    /**
     * Gets the journals property value. The journals property
     * @return a journal
     */
    @javax.annotation.Nullable
    public java.util.List<Journal> getJournals() {
        return this._journals;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the paymentMethods property value. The paymentMethods property
     * @return a paymentMethod
     */
    @javax.annotation.Nullable
    public java.util.List<PaymentMethod> getPaymentMethods() {
        return this._paymentMethods;
    }
    /**
     * Gets the paymentTerms property value. The paymentTerms property
     * @return a paymentTerm
     */
    @javax.annotation.Nullable
    public java.util.List<PaymentTerm> getPaymentTerms() {
        return this._paymentTerms;
    }
    /**
     * Gets the picture property value. The picture property
     * @return a picture
     */
    @javax.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this._picture;
    }
    /**
     * Gets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @return a purchaseInvoiceLine
     */
    @javax.annotation.Nullable
    public java.util.List<PurchaseInvoiceLine> getPurchaseInvoiceLines() {
        return this._purchaseInvoiceLines;
    }
    /**
     * Gets the purchaseInvoices property value. The purchaseInvoices property
     * @return a purchaseInvoice
     */
    @javax.annotation.Nullable
    public java.util.List<PurchaseInvoice> getPurchaseInvoices() {
        return this._purchaseInvoices;
    }
    /**
     * Gets the salesCreditMemoLines property value. The salesCreditMemoLines property
     * @return a salesCreditMemoLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesCreditMemoLine> getSalesCreditMemoLines() {
        return this._salesCreditMemoLines;
    }
    /**
     * Gets the salesCreditMemos property value. The salesCreditMemos property
     * @return a salesCreditMemo
     */
    @javax.annotation.Nullable
    public java.util.List<SalesCreditMemo> getSalesCreditMemos() {
        return this._salesCreditMemos;
    }
    /**
     * Gets the salesInvoiceLines property value. The salesInvoiceLines property
     * @return a salesInvoiceLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesInvoiceLine> getSalesInvoiceLines() {
        return this._salesInvoiceLines;
    }
    /**
     * Gets the salesInvoices property value. The salesInvoices property
     * @return a salesInvoice
     */
    @javax.annotation.Nullable
    public java.util.List<SalesInvoice> getSalesInvoices() {
        return this._salesInvoices;
    }
    /**
     * Gets the salesOrderLines property value. The salesOrderLines property
     * @return a salesOrderLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesOrderLine> getSalesOrderLines() {
        return this._salesOrderLines;
    }
    /**
     * Gets the salesOrders property value. The salesOrders property
     * @return a salesOrder
     */
    @javax.annotation.Nullable
    public java.util.List<SalesOrder> getSalesOrders() {
        return this._salesOrders;
    }
    /**
     * Gets the salesQuoteLines property value. The salesQuoteLines property
     * @return a salesQuoteLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesQuoteLine> getSalesQuoteLines() {
        return this._salesQuoteLines;
    }
    /**
     * Gets the salesQuotes property value. The salesQuotes property
     * @return a salesQuote
     */
    @javax.annotation.Nullable
    public java.util.List<SalesQuote> getSalesQuotes() {
        return this._salesQuotes;
    }
    /**
     * Gets the shipmentMethods property value. The shipmentMethods property
     * @return a shipmentMethod
     */
    @javax.annotation.Nullable
    public java.util.List<ShipmentMethod> getShipmentMethods() {
        return this._shipmentMethods;
    }
    /**
     * Gets the systemVersion property value. The systemVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSystemVersion() {
        return this._systemVersion;
    }
    /**
     * Gets the taxAreas property value. The taxAreas property
     * @return a taxArea
     */
    @javax.annotation.Nullable
    public java.util.List<TaxArea> getTaxAreas() {
        return this._taxAreas;
    }
    /**
     * Gets the taxGroups property value. The taxGroups property
     * @return a taxGroup
     */
    @javax.annotation.Nullable
    public java.util.List<TaxGroup> getTaxGroups() {
        return this._taxGroups;
    }
    /**
     * Gets the unitsOfMeasure property value. The unitsOfMeasure property
     * @return a unitOfMeasure
     */
    @javax.annotation.Nullable
    public java.util.List<UnitOfMeasure> getUnitsOfMeasure() {
        return this._unitsOfMeasure;
    }
    /**
     * Gets the vendors property value. The vendors property
     * @return a vendor
     */
    @javax.annotation.Nullable
    public java.util.List<Vendor> getVendors() {
        return this._vendors;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accounts", this.getAccounts());
        writer.writeCollectionOfObjectValues("agedAccountsPayable", this.getAgedAccountsPayable());
        writer.writeCollectionOfObjectValues("agedAccountsReceivable", this.getAgedAccountsReceivable());
        writer.writeStringValue("businessProfileId", this.getBusinessProfileId());
        writer.writeCollectionOfObjectValues("companyInformation", this.getCompanyInformation());
        writer.writeCollectionOfObjectValues("countriesRegions", this.getCountriesRegions());
        writer.writeCollectionOfObjectValues("currencies", this.getCurrencies());
        writer.writeCollectionOfObjectValues("customerPaymentJournals", this.getCustomerPaymentJournals());
        writer.writeCollectionOfObjectValues("customerPayments", this.getCustomerPayments());
        writer.writeCollectionOfObjectValues("customers", this.getCustomers());
        writer.writeCollectionOfObjectValues("dimensions", this.getDimensions());
        writer.writeCollectionOfObjectValues("dimensionValues", this.getDimensionValues());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("employees", this.getEmployees());
        writer.writeCollectionOfObjectValues("generalLedgerEntries", this.getGeneralLedgerEntries());
        writer.writeCollectionOfObjectValues("itemCategories", this.getItemCategories());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeCollectionOfObjectValues("journalLines", this.getJournalLines());
        writer.writeCollectionOfObjectValues("journals", this.getJournals());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("paymentMethods", this.getPaymentMethods());
        writer.writeCollectionOfObjectValues("paymentTerms", this.getPaymentTerms());
        writer.writeCollectionOfObjectValues("picture", this.getPicture());
        writer.writeCollectionOfObjectValues("purchaseInvoiceLines", this.getPurchaseInvoiceLines());
        writer.writeCollectionOfObjectValues("purchaseInvoices", this.getPurchaseInvoices());
        writer.writeCollectionOfObjectValues("salesCreditMemoLines", this.getSalesCreditMemoLines());
        writer.writeCollectionOfObjectValues("salesCreditMemos", this.getSalesCreditMemos());
        writer.writeCollectionOfObjectValues("salesInvoiceLines", this.getSalesInvoiceLines());
        writer.writeCollectionOfObjectValues("salesInvoices", this.getSalesInvoices());
        writer.writeCollectionOfObjectValues("salesOrderLines", this.getSalesOrderLines());
        writer.writeCollectionOfObjectValues("salesOrders", this.getSalesOrders());
        writer.writeCollectionOfObjectValues("salesQuoteLines", this.getSalesQuoteLines());
        writer.writeCollectionOfObjectValues("salesQuotes", this.getSalesQuotes());
        writer.writeCollectionOfObjectValues("shipmentMethods", this.getShipmentMethods());
        writer.writeStringValue("systemVersion", this.getSystemVersion());
        writer.writeCollectionOfObjectValues("taxAreas", this.getTaxAreas());
        writer.writeCollectionOfObjectValues("taxGroups", this.getTaxGroups());
        writer.writeCollectionOfObjectValues("unitsOfMeasure", this.getUnitsOfMeasure());
        writer.writeCollectionOfObjectValues("vendors", this.getVendors());
    }
    /**
     * Sets the accounts property value. The accounts property
     * @param value Value to set for the accounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccounts(@javax.annotation.Nullable final java.util.List<Account> value) {
        this._accounts = value;
    }
    /**
     * Sets the agedAccountsPayable property value. The agedAccountsPayable property
     * @param value Value to set for the agedAccountsPayable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgedAccountsPayable(@javax.annotation.Nullable final java.util.List<AgedAccountsPayable> value) {
        this._agedAccountsPayable = value;
    }
    /**
     * Sets the agedAccountsReceivable property value. The agedAccountsReceivable property
     * @param value Value to set for the agedAccountsReceivable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgedAccountsReceivable(@javax.annotation.Nullable final java.util.List<AgedAccountsReceivable> value) {
        this._agedAccountsReceivable = value;
    }
    /**
     * Sets the businessProfileId property value. The businessProfileId property
     * @param value Value to set for the businessProfileId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessProfileId(@javax.annotation.Nullable final String value) {
        this._businessProfileId = value;
    }
    /**
     * Sets the companyInformation property value. The companyInformation property
     * @param value Value to set for the companyInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyInformation(@javax.annotation.Nullable final java.util.List<CompanyInformation> value) {
        this._companyInformation = value;
    }
    /**
     * Sets the countriesRegions property value. The countriesRegions property
     * @param value Value to set for the countriesRegions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountriesRegions(@javax.annotation.Nullable final java.util.List<CountryRegion> value) {
        this._countriesRegions = value;
    }
    /**
     * Sets the currencies property value. The currencies property
     * @param value Value to set for the currencies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrencies(@javax.annotation.Nullable final java.util.List<Currency> value) {
        this._currencies = value;
    }
    /**
     * Sets the customerPaymentJournals property value. The customerPaymentJournals property
     * @param value Value to set for the customerPaymentJournals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerPaymentJournals(@javax.annotation.Nullable final java.util.List<CustomerPaymentJournal> value) {
        this._customerPaymentJournals = value;
    }
    /**
     * Sets the customerPayments property value. The customerPayments property
     * @param value Value to set for the customerPayments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerPayments(@javax.annotation.Nullable final java.util.List<CustomerPayment> value) {
        this._customerPayments = value;
    }
    /**
     * Sets the customers property value. The customers property
     * @param value Value to set for the customers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomers(@javax.annotation.Nullable final java.util.List<Customer> value) {
        this._customers = value;
    }
    /**
     * Sets the dimensions property value. The dimensions property
     * @param value Value to set for the dimensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDimensions(@javax.annotation.Nullable final java.util.List<Dimension> value) {
        this._dimensions = value;
    }
    /**
     * Sets the dimensionValues property value. The dimensionValues property
     * @param value Value to set for the dimensionValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDimensionValues(@javax.annotation.Nullable final java.util.List<DimensionValue> value) {
        this._dimensionValues = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the employees property value. The employees property
     * @param value Value to set for the employees property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmployees(@javax.annotation.Nullable final java.util.List<Employee> value) {
        this._employees = value;
    }
    /**
     * Sets the generalLedgerEntries property value. The generalLedgerEntries property
     * @param value Value to set for the generalLedgerEntries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeneralLedgerEntries(@javax.annotation.Nullable final java.util.List<GeneralLedgerEntry> value) {
        this._generalLedgerEntries = value;
    }
    /**
     * Sets the itemCategories property value. The itemCategories property
     * @param value Value to set for the itemCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCategories(@javax.annotation.Nullable final java.util.List<ItemCategory> value) {
        this._itemCategories = value;
    }
    /**
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<Item> value) {
        this._items = value;
    }
    /**
     * Sets the journalLines property value. The journalLines property
     * @param value Value to set for the journalLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJournalLines(@javax.annotation.Nullable final java.util.List<JournalLine> value) {
        this._journalLines = value;
    }
    /**
     * Sets the journals property value. The journals property
     * @param value Value to set for the journals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJournals(@javax.annotation.Nullable final java.util.List<Journal> value) {
        this._journals = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the paymentMethods property value. The paymentMethods property
     * @param value Value to set for the paymentMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentMethods(@javax.annotation.Nullable final java.util.List<PaymentMethod> value) {
        this._paymentMethods = value;
    }
    /**
     * Sets the paymentTerms property value. The paymentTerms property
     * @param value Value to set for the paymentTerms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentTerms(@javax.annotation.Nullable final java.util.List<PaymentTerm> value) {
        this._paymentTerms = value;
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPicture(@javax.annotation.Nullable final java.util.List<Picture> value) {
        this._picture = value;
    }
    /**
     * Sets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @param value Value to set for the purchaseInvoiceLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPurchaseInvoiceLines(@javax.annotation.Nullable final java.util.List<PurchaseInvoiceLine> value) {
        this._purchaseInvoiceLines = value;
    }
    /**
     * Sets the purchaseInvoices property value. The purchaseInvoices property
     * @param value Value to set for the purchaseInvoices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPurchaseInvoices(@javax.annotation.Nullable final java.util.List<PurchaseInvoice> value) {
        this._purchaseInvoices = value;
    }
    /**
     * Sets the salesCreditMemoLines property value. The salesCreditMemoLines property
     * @param value Value to set for the salesCreditMemoLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesCreditMemoLines(@javax.annotation.Nullable final java.util.List<SalesCreditMemoLine> value) {
        this._salesCreditMemoLines = value;
    }
    /**
     * Sets the salesCreditMemos property value. The salesCreditMemos property
     * @param value Value to set for the salesCreditMemos property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesCreditMemos(@javax.annotation.Nullable final java.util.List<SalesCreditMemo> value) {
        this._salesCreditMemos = value;
    }
    /**
     * Sets the salesInvoiceLines property value. The salesInvoiceLines property
     * @param value Value to set for the salesInvoiceLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesInvoiceLines(@javax.annotation.Nullable final java.util.List<SalesInvoiceLine> value) {
        this._salesInvoiceLines = value;
    }
    /**
     * Sets the salesInvoices property value. The salesInvoices property
     * @param value Value to set for the salesInvoices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesInvoices(@javax.annotation.Nullable final java.util.List<SalesInvoice> value) {
        this._salesInvoices = value;
    }
    /**
     * Sets the salesOrderLines property value. The salesOrderLines property
     * @param value Value to set for the salesOrderLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesOrderLines(@javax.annotation.Nullable final java.util.List<SalesOrderLine> value) {
        this._salesOrderLines = value;
    }
    /**
     * Sets the salesOrders property value. The salesOrders property
     * @param value Value to set for the salesOrders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesOrders(@javax.annotation.Nullable final java.util.List<SalesOrder> value) {
        this._salesOrders = value;
    }
    /**
     * Sets the salesQuoteLines property value. The salesQuoteLines property
     * @param value Value to set for the salesQuoteLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesQuoteLines(@javax.annotation.Nullable final java.util.List<SalesQuoteLine> value) {
        this._salesQuoteLines = value;
    }
    /**
     * Sets the salesQuotes property value. The salesQuotes property
     * @param value Value to set for the salesQuotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesQuotes(@javax.annotation.Nullable final java.util.List<SalesQuote> value) {
        this._salesQuotes = value;
    }
    /**
     * Sets the shipmentMethods property value. The shipmentMethods property
     * @param value Value to set for the shipmentMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipmentMethods(@javax.annotation.Nullable final java.util.List<ShipmentMethod> value) {
        this._shipmentMethods = value;
    }
    /**
     * Sets the systemVersion property value. The systemVersion property
     * @param value Value to set for the systemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemVersion(@javax.annotation.Nullable final String value) {
        this._systemVersion = value;
    }
    /**
     * Sets the taxAreas property value. The taxAreas property
     * @param value Value to set for the taxAreas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxAreas(@javax.annotation.Nullable final java.util.List<TaxArea> value) {
        this._taxAreas = value;
    }
    /**
     * Sets the taxGroups property value. The taxGroups property
     * @param value Value to set for the taxGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxGroups(@javax.annotation.Nullable final java.util.List<TaxGroup> value) {
        this._taxGroups = value;
    }
    /**
     * Sets the unitsOfMeasure property value. The unitsOfMeasure property
     * @param value Value to set for the unitsOfMeasure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnitsOfMeasure(@javax.annotation.Nullable final java.util.List<UnitOfMeasure> value) {
        this._unitsOfMeasure = value;
    }
    /**
     * Sets the vendors property value. The vendors property
     * @param value Value to set for the vendors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendors(@javax.annotation.Nullable final java.util.List<Vendor> value) {
        this._vendors = value;
    }
}
