package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class Company implements AdditionalDataHolder, Parsable {
    /** The accounts property */
    private java.util.List<Account> accounts;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The agedAccountsPayable property */
    private java.util.List<AgedAccountsPayable> agedAccountsPayable;
    /** The agedAccountsReceivable property */
    private java.util.List<AgedAccountsReceivable> agedAccountsReceivable;
    /** The businessProfileId property */
    private String businessProfileId;
    /** The companyInformation property */
    private java.util.List<CompanyInformation> companyInformation;
    /** The countriesRegions property */
    private java.util.List<CountryRegion> countriesRegions;
    /** The currencies property */
    private java.util.List<Currency> currencies;
    /** The customerPaymentJournals property */
    private java.util.List<CustomerPaymentJournal> customerPaymentJournals;
    /** The customerPayments property */
    private java.util.List<CustomerPayment> customerPayments;
    /** The customers property */
    private java.util.List<Customer> customers;
    /** The dimensions property */
    private java.util.List<Dimension> dimensions;
    /** The dimensionValues property */
    private java.util.List<DimensionValue> dimensionValues;
    /** The displayName property */
    private String displayName;
    /** The employees property */
    private java.util.List<Employee> employees;
    /** The generalLedgerEntries property */
    private java.util.List<GeneralLedgerEntry> generalLedgerEntries;
    /** The id property */
    private UUID id;
    /** The itemCategories property */
    private java.util.List<ItemCategory> itemCategories;
    /** The items property */
    private java.util.List<Item> items;
    /** The journalLines property */
    private java.util.List<JournalLine> journalLines;
    /** The journals property */
    private java.util.List<Journal> journals;
    /** The name property */
    private String name;
    /** The OdataType property */
    private String odataType;
    /** The paymentMethods property */
    private java.util.List<PaymentMethod> paymentMethods;
    /** The paymentTerms property */
    private java.util.List<PaymentTerm> paymentTerms;
    /** The picture property */
    private java.util.List<Picture> picture;
    /** The purchaseInvoiceLines property */
    private java.util.List<PurchaseInvoiceLine> purchaseInvoiceLines;
    /** The purchaseInvoices property */
    private java.util.List<PurchaseInvoice> purchaseInvoices;
    /** The salesCreditMemoLines property */
    private java.util.List<SalesCreditMemoLine> salesCreditMemoLines;
    /** The salesCreditMemos property */
    private java.util.List<SalesCreditMemo> salesCreditMemos;
    /** The salesInvoiceLines property */
    private java.util.List<SalesInvoiceLine> salesInvoiceLines;
    /** The salesInvoices property */
    private java.util.List<SalesInvoice> salesInvoices;
    /** The salesOrderLines property */
    private java.util.List<SalesOrderLine> salesOrderLines;
    /** The salesOrders property */
    private java.util.List<SalesOrder> salesOrders;
    /** The salesQuoteLines property */
    private java.util.List<SalesQuoteLine> salesQuoteLines;
    /** The salesQuotes property */
    private java.util.List<SalesQuote> salesQuotes;
    /** The shipmentMethods property */
    private java.util.List<ShipmentMethod> shipmentMethods;
    /** The systemVersion property */
    private String systemVersion;
    /** The taxAreas property */
    private java.util.List<TaxArea> taxAreas;
    /** The taxGroups property */
    private java.util.List<TaxGroup> taxGroups;
    /** The unitsOfMeasure property */
    private java.util.List<UnitOfMeasure> unitsOfMeasure;
    /** The vendors property */
    private java.util.List<Vendor> vendors;
    /**
     * Instantiates a new company and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Company() {
        this.setAdditionalData(new HashMap<>());
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
        return this.accounts;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the agedAccountsPayable property value. The agedAccountsPayable property
     * @return a agedAccountsPayable
     */
    @javax.annotation.Nullable
    public java.util.List<AgedAccountsPayable> getAgedAccountsPayable() {
        return this.agedAccountsPayable;
    }
    /**
     * Gets the agedAccountsReceivable property value. The agedAccountsReceivable property
     * @return a agedAccountsReceivable
     */
    @javax.annotation.Nullable
    public java.util.List<AgedAccountsReceivable> getAgedAccountsReceivable() {
        return this.agedAccountsReceivable;
    }
    /**
     * Gets the businessProfileId property value. The businessProfileId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBusinessProfileId() {
        return this.businessProfileId;
    }
    /**
     * Gets the companyInformation property value. The companyInformation property
     * @return a companyInformation
     */
    @javax.annotation.Nullable
    public java.util.List<CompanyInformation> getCompanyInformation() {
        return this.companyInformation;
    }
    /**
     * Gets the countriesRegions property value. The countriesRegions property
     * @return a countryRegion
     */
    @javax.annotation.Nullable
    public java.util.List<CountryRegion> getCountriesRegions() {
        return this.countriesRegions;
    }
    /**
     * Gets the currencies property value. The currencies property
     * @return a currency
     */
    @javax.annotation.Nullable
    public java.util.List<Currency> getCurrencies() {
        return this.currencies;
    }
    /**
     * Gets the customerPaymentJournals property value. The customerPaymentJournals property
     * @return a customerPaymentJournal
     */
    @javax.annotation.Nullable
    public java.util.List<CustomerPaymentJournal> getCustomerPaymentJournals() {
        return this.customerPaymentJournals;
    }
    /**
     * Gets the customerPayments property value. The customerPayments property
     * @return a customerPayment
     */
    @javax.annotation.Nullable
    public java.util.List<CustomerPayment> getCustomerPayments() {
        return this.customerPayments;
    }
    /**
     * Gets the customers property value. The customers property
     * @return a customer
     */
    @javax.annotation.Nullable
    public java.util.List<Customer> getCustomers() {
        return this.customers;
    }
    /**
     * Gets the dimensions property value. The dimensions property
     * @return a dimension
     */
    @javax.annotation.Nullable
    public java.util.List<Dimension> getDimensions() {
        return this.dimensions;
    }
    /**
     * Gets the dimensionValues property value. The dimensionValues property
     * @return a dimensionValue
     */
    @javax.annotation.Nullable
    public java.util.List<DimensionValue> getDimensionValues() {
        return this.dimensionValues;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the employees property value. The employees property
     * @return a employee
     */
    @javax.annotation.Nullable
    public java.util.List<Employee> getEmployees() {
        return this.employees;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(41);
        deserializerMap.put("accounts", (n) -> { this.setAccounts(n.getCollectionOfObjectValues(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("agedAccountsPayable", (n) -> { this.setAgedAccountsPayable(n.getCollectionOfObjectValues(AgedAccountsPayable::createFromDiscriminatorValue)); });
        deserializerMap.put("agedAccountsReceivable", (n) -> { this.setAgedAccountsReceivable(n.getCollectionOfObjectValues(AgedAccountsReceivable::createFromDiscriminatorValue)); });
        deserializerMap.put("businessProfileId", (n) -> { this.setBusinessProfileId(n.getStringValue()); });
        deserializerMap.put("companyInformation", (n) -> { this.setCompanyInformation(n.getCollectionOfObjectValues(CompanyInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("countriesRegions", (n) -> { this.setCountriesRegions(n.getCollectionOfObjectValues(CountryRegion::createFromDiscriminatorValue)); });
        deserializerMap.put("currencies", (n) -> { this.setCurrencies(n.getCollectionOfObjectValues(Currency::createFromDiscriminatorValue)); });
        deserializerMap.put("customerPaymentJournals", (n) -> { this.setCustomerPaymentJournals(n.getCollectionOfObjectValues(CustomerPaymentJournal::createFromDiscriminatorValue)); });
        deserializerMap.put("customerPayments", (n) -> { this.setCustomerPayments(n.getCollectionOfObjectValues(CustomerPayment::createFromDiscriminatorValue)); });
        deserializerMap.put("customers", (n) -> { this.setCustomers(n.getCollectionOfObjectValues(Customer::createFromDiscriminatorValue)); });
        deserializerMap.put("dimensions", (n) -> { this.setDimensions(n.getCollectionOfObjectValues(Dimension::createFromDiscriminatorValue)); });
        deserializerMap.put("dimensionValues", (n) -> { this.setDimensionValues(n.getCollectionOfObjectValues(DimensionValue::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("employees", (n) -> { this.setEmployees(n.getCollectionOfObjectValues(Employee::createFromDiscriminatorValue)); });
        deserializerMap.put("generalLedgerEntries", (n) -> { this.setGeneralLedgerEntries(n.getCollectionOfObjectValues(GeneralLedgerEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("itemCategories", (n) -> { this.setItemCategories(n.getCollectionOfObjectValues(ItemCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(Item::createFromDiscriminatorValue)); });
        deserializerMap.put("journalLines", (n) -> { this.setJournalLines(n.getCollectionOfObjectValues(JournalLine::createFromDiscriminatorValue)); });
        deserializerMap.put("journals", (n) -> { this.setJournals(n.getCollectionOfObjectValues(Journal::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("paymentMethods", (n) -> { this.setPaymentMethods(n.getCollectionOfObjectValues(PaymentMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentTerms", (n) -> { this.setPaymentTerms(n.getCollectionOfObjectValues(PaymentTerm::createFromDiscriminatorValue)); });
        deserializerMap.put("picture", (n) -> { this.setPicture(n.getCollectionOfObjectValues(Picture::createFromDiscriminatorValue)); });
        deserializerMap.put("purchaseInvoiceLines", (n) -> { this.setPurchaseInvoiceLines(n.getCollectionOfObjectValues(PurchaseInvoiceLine::createFromDiscriminatorValue)); });
        deserializerMap.put("purchaseInvoices", (n) -> { this.setPurchaseInvoices(n.getCollectionOfObjectValues(PurchaseInvoice::createFromDiscriminatorValue)); });
        deserializerMap.put("salesCreditMemoLines", (n) -> { this.setSalesCreditMemoLines(n.getCollectionOfObjectValues(SalesCreditMemoLine::createFromDiscriminatorValue)); });
        deserializerMap.put("salesCreditMemos", (n) -> { this.setSalesCreditMemos(n.getCollectionOfObjectValues(SalesCreditMemo::createFromDiscriminatorValue)); });
        deserializerMap.put("salesInvoiceLines", (n) -> { this.setSalesInvoiceLines(n.getCollectionOfObjectValues(SalesInvoiceLine::createFromDiscriminatorValue)); });
        deserializerMap.put("salesInvoices", (n) -> { this.setSalesInvoices(n.getCollectionOfObjectValues(SalesInvoice::createFromDiscriminatorValue)); });
        deserializerMap.put("salesOrderLines", (n) -> { this.setSalesOrderLines(n.getCollectionOfObjectValues(SalesOrderLine::createFromDiscriminatorValue)); });
        deserializerMap.put("salesOrders", (n) -> { this.setSalesOrders(n.getCollectionOfObjectValues(SalesOrder::createFromDiscriminatorValue)); });
        deserializerMap.put("salesQuoteLines", (n) -> { this.setSalesQuoteLines(n.getCollectionOfObjectValues(SalesQuoteLine::createFromDiscriminatorValue)); });
        deserializerMap.put("salesQuotes", (n) -> { this.setSalesQuotes(n.getCollectionOfObjectValues(SalesQuote::createFromDiscriminatorValue)); });
        deserializerMap.put("shipmentMethods", (n) -> { this.setShipmentMethods(n.getCollectionOfObjectValues(ShipmentMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("systemVersion", (n) -> { this.setSystemVersion(n.getStringValue()); });
        deserializerMap.put("taxAreas", (n) -> { this.setTaxAreas(n.getCollectionOfObjectValues(TaxArea::createFromDiscriminatorValue)); });
        deserializerMap.put("taxGroups", (n) -> { this.setTaxGroups(n.getCollectionOfObjectValues(TaxGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("unitsOfMeasure", (n) -> { this.setUnitsOfMeasure(n.getCollectionOfObjectValues(UnitOfMeasure::createFromDiscriminatorValue)); });
        deserializerMap.put("vendors", (n) -> { this.setVendors(n.getCollectionOfObjectValues(Vendor::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the generalLedgerEntries property value. The generalLedgerEntries property
     * @return a generalLedgerEntry
     */
    @javax.annotation.Nullable
    public java.util.List<GeneralLedgerEntry> getGeneralLedgerEntries() {
        return this.generalLedgerEntries;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the itemCategories property value. The itemCategories property
     * @return a itemCategory
     */
    @javax.annotation.Nullable
    public java.util.List<ItemCategory> getItemCategories() {
        return this.itemCategories;
    }
    /**
     * Gets the items property value. The items property
     * @return a item
     */
    @javax.annotation.Nullable
    public java.util.List<Item> getItems() {
        return this.items;
    }
    /**
     * Gets the journalLines property value. The journalLines property
     * @return a journalLine
     */
    @javax.annotation.Nullable
    public java.util.List<JournalLine> getJournalLines() {
        return this.journalLines;
    }
    /**
     * Gets the journals property value. The journals property
     * @return a journal
     */
    @javax.annotation.Nullable
    public java.util.List<Journal> getJournals() {
        return this.journals;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the paymentMethods property value. The paymentMethods property
     * @return a paymentMethod
     */
    @javax.annotation.Nullable
    public java.util.List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }
    /**
     * Gets the paymentTerms property value. The paymentTerms property
     * @return a paymentTerm
     */
    @javax.annotation.Nullable
    public java.util.List<PaymentTerm> getPaymentTerms() {
        return this.paymentTerms;
    }
    /**
     * Gets the picture property value. The picture property
     * @return a picture
     */
    @javax.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.picture;
    }
    /**
     * Gets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @return a purchaseInvoiceLine
     */
    @javax.annotation.Nullable
    public java.util.List<PurchaseInvoiceLine> getPurchaseInvoiceLines() {
        return this.purchaseInvoiceLines;
    }
    /**
     * Gets the purchaseInvoices property value. The purchaseInvoices property
     * @return a purchaseInvoice
     */
    @javax.annotation.Nullable
    public java.util.List<PurchaseInvoice> getPurchaseInvoices() {
        return this.purchaseInvoices;
    }
    /**
     * Gets the salesCreditMemoLines property value. The salesCreditMemoLines property
     * @return a salesCreditMemoLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesCreditMemoLine> getSalesCreditMemoLines() {
        return this.salesCreditMemoLines;
    }
    /**
     * Gets the salesCreditMemos property value. The salesCreditMemos property
     * @return a salesCreditMemo
     */
    @javax.annotation.Nullable
    public java.util.List<SalesCreditMemo> getSalesCreditMemos() {
        return this.salesCreditMemos;
    }
    /**
     * Gets the salesInvoiceLines property value. The salesInvoiceLines property
     * @return a salesInvoiceLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesInvoiceLine> getSalesInvoiceLines() {
        return this.salesInvoiceLines;
    }
    /**
     * Gets the salesInvoices property value. The salesInvoices property
     * @return a salesInvoice
     */
    @javax.annotation.Nullable
    public java.util.List<SalesInvoice> getSalesInvoices() {
        return this.salesInvoices;
    }
    /**
     * Gets the salesOrderLines property value. The salesOrderLines property
     * @return a salesOrderLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesOrderLine> getSalesOrderLines() {
        return this.salesOrderLines;
    }
    /**
     * Gets the salesOrders property value. The salesOrders property
     * @return a salesOrder
     */
    @javax.annotation.Nullable
    public java.util.List<SalesOrder> getSalesOrders() {
        return this.salesOrders;
    }
    /**
     * Gets the salesQuoteLines property value. The salesQuoteLines property
     * @return a salesQuoteLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesQuoteLine> getSalesQuoteLines() {
        return this.salesQuoteLines;
    }
    /**
     * Gets the salesQuotes property value. The salesQuotes property
     * @return a salesQuote
     */
    @javax.annotation.Nullable
    public java.util.List<SalesQuote> getSalesQuotes() {
        return this.salesQuotes;
    }
    /**
     * Gets the shipmentMethods property value. The shipmentMethods property
     * @return a shipmentMethod
     */
    @javax.annotation.Nullable
    public java.util.List<ShipmentMethod> getShipmentMethods() {
        return this.shipmentMethods;
    }
    /**
     * Gets the systemVersion property value. The systemVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSystemVersion() {
        return this.systemVersion;
    }
    /**
     * Gets the taxAreas property value. The taxAreas property
     * @return a taxArea
     */
    @javax.annotation.Nullable
    public java.util.List<TaxArea> getTaxAreas() {
        return this.taxAreas;
    }
    /**
     * Gets the taxGroups property value. The taxGroups property
     * @return a taxGroup
     */
    @javax.annotation.Nullable
    public java.util.List<TaxGroup> getTaxGroups() {
        return this.taxGroups;
    }
    /**
     * Gets the unitsOfMeasure property value. The unitsOfMeasure property
     * @return a unitOfMeasure
     */
    @javax.annotation.Nullable
    public java.util.List<UnitOfMeasure> getUnitsOfMeasure() {
        return this.unitsOfMeasure;
    }
    /**
     * Gets the vendors property value. The vendors property
     * @return a vendor
     */
    @javax.annotation.Nullable
    public java.util.List<Vendor> getVendors() {
        return this.vendors;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
        writer.writeUUIDValue("id", this.getId());
        writer.writeCollectionOfObjectValues("itemCategories", this.getItemCategories());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeCollectionOfObjectValues("journalLines", this.getJournalLines());
        writer.writeCollectionOfObjectValues("journals", this.getJournals());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accounts property value. The accounts property
     * @param value Value to set for the accounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccounts(@javax.annotation.Nullable final java.util.List<Account> value) {
        this.accounts = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the agedAccountsPayable property value. The agedAccountsPayable property
     * @param value Value to set for the agedAccountsPayable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgedAccountsPayable(@javax.annotation.Nullable final java.util.List<AgedAccountsPayable> value) {
        this.agedAccountsPayable = value;
    }
    /**
     * Sets the agedAccountsReceivable property value. The agedAccountsReceivable property
     * @param value Value to set for the agedAccountsReceivable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgedAccountsReceivable(@javax.annotation.Nullable final java.util.List<AgedAccountsReceivable> value) {
        this.agedAccountsReceivable = value;
    }
    /**
     * Sets the businessProfileId property value. The businessProfileId property
     * @param value Value to set for the businessProfileId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessProfileId(@javax.annotation.Nullable final String value) {
        this.businessProfileId = value;
    }
    /**
     * Sets the companyInformation property value. The companyInformation property
     * @param value Value to set for the companyInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyInformation(@javax.annotation.Nullable final java.util.List<CompanyInformation> value) {
        this.companyInformation = value;
    }
    /**
     * Sets the countriesRegions property value. The countriesRegions property
     * @param value Value to set for the countriesRegions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountriesRegions(@javax.annotation.Nullable final java.util.List<CountryRegion> value) {
        this.countriesRegions = value;
    }
    /**
     * Sets the currencies property value. The currencies property
     * @param value Value to set for the currencies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrencies(@javax.annotation.Nullable final java.util.List<Currency> value) {
        this.currencies = value;
    }
    /**
     * Sets the customerPaymentJournals property value. The customerPaymentJournals property
     * @param value Value to set for the customerPaymentJournals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerPaymentJournals(@javax.annotation.Nullable final java.util.List<CustomerPaymentJournal> value) {
        this.customerPaymentJournals = value;
    }
    /**
     * Sets the customerPayments property value. The customerPayments property
     * @param value Value to set for the customerPayments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerPayments(@javax.annotation.Nullable final java.util.List<CustomerPayment> value) {
        this.customerPayments = value;
    }
    /**
     * Sets the customers property value. The customers property
     * @param value Value to set for the customers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomers(@javax.annotation.Nullable final java.util.List<Customer> value) {
        this.customers = value;
    }
    /**
     * Sets the dimensions property value. The dimensions property
     * @param value Value to set for the dimensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDimensions(@javax.annotation.Nullable final java.util.List<Dimension> value) {
        this.dimensions = value;
    }
    /**
     * Sets the dimensionValues property value. The dimensionValues property
     * @param value Value to set for the dimensionValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDimensionValues(@javax.annotation.Nullable final java.util.List<DimensionValue> value) {
        this.dimensionValues = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the employees property value. The employees property
     * @param value Value to set for the employees property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmployees(@javax.annotation.Nullable final java.util.List<Employee> value) {
        this.employees = value;
    }
    /**
     * Sets the generalLedgerEntries property value. The generalLedgerEntries property
     * @param value Value to set for the generalLedgerEntries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeneralLedgerEntries(@javax.annotation.Nullable final java.util.List<GeneralLedgerEntry> value) {
        this.generalLedgerEntries = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the itemCategories property value. The itemCategories property
     * @param value Value to set for the itemCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCategories(@javax.annotation.Nullable final java.util.List<ItemCategory> value) {
        this.itemCategories = value;
    }
    /**
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<Item> value) {
        this.items = value;
    }
    /**
     * Sets the journalLines property value. The journalLines property
     * @param value Value to set for the journalLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJournalLines(@javax.annotation.Nullable final java.util.List<JournalLine> value) {
        this.journalLines = value;
    }
    /**
     * Sets the journals property value. The journals property
     * @param value Value to set for the journals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJournals(@javax.annotation.Nullable final java.util.List<Journal> value) {
        this.journals = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the paymentMethods property value. The paymentMethods property
     * @param value Value to set for the paymentMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentMethods(@javax.annotation.Nullable final java.util.List<PaymentMethod> value) {
        this.paymentMethods = value;
    }
    /**
     * Sets the paymentTerms property value. The paymentTerms property
     * @param value Value to set for the paymentTerms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentTerms(@javax.annotation.Nullable final java.util.List<PaymentTerm> value) {
        this.paymentTerms = value;
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPicture(@javax.annotation.Nullable final java.util.List<Picture> value) {
        this.picture = value;
    }
    /**
     * Sets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @param value Value to set for the purchaseInvoiceLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPurchaseInvoiceLines(@javax.annotation.Nullable final java.util.List<PurchaseInvoiceLine> value) {
        this.purchaseInvoiceLines = value;
    }
    /**
     * Sets the purchaseInvoices property value. The purchaseInvoices property
     * @param value Value to set for the purchaseInvoices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPurchaseInvoices(@javax.annotation.Nullable final java.util.List<PurchaseInvoice> value) {
        this.purchaseInvoices = value;
    }
    /**
     * Sets the salesCreditMemoLines property value. The salesCreditMemoLines property
     * @param value Value to set for the salesCreditMemoLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesCreditMemoLines(@javax.annotation.Nullable final java.util.List<SalesCreditMemoLine> value) {
        this.salesCreditMemoLines = value;
    }
    /**
     * Sets the salesCreditMemos property value. The salesCreditMemos property
     * @param value Value to set for the salesCreditMemos property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesCreditMemos(@javax.annotation.Nullable final java.util.List<SalesCreditMemo> value) {
        this.salesCreditMemos = value;
    }
    /**
     * Sets the salesInvoiceLines property value. The salesInvoiceLines property
     * @param value Value to set for the salesInvoiceLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesInvoiceLines(@javax.annotation.Nullable final java.util.List<SalesInvoiceLine> value) {
        this.salesInvoiceLines = value;
    }
    /**
     * Sets the salesInvoices property value. The salesInvoices property
     * @param value Value to set for the salesInvoices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesInvoices(@javax.annotation.Nullable final java.util.List<SalesInvoice> value) {
        this.salesInvoices = value;
    }
    /**
     * Sets the salesOrderLines property value. The salesOrderLines property
     * @param value Value to set for the salesOrderLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesOrderLines(@javax.annotation.Nullable final java.util.List<SalesOrderLine> value) {
        this.salesOrderLines = value;
    }
    /**
     * Sets the salesOrders property value. The salesOrders property
     * @param value Value to set for the salesOrders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesOrders(@javax.annotation.Nullable final java.util.List<SalesOrder> value) {
        this.salesOrders = value;
    }
    /**
     * Sets the salesQuoteLines property value. The salesQuoteLines property
     * @param value Value to set for the salesQuoteLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesQuoteLines(@javax.annotation.Nullable final java.util.List<SalesQuoteLine> value) {
        this.salesQuoteLines = value;
    }
    /**
     * Sets the salesQuotes property value. The salesQuotes property
     * @param value Value to set for the salesQuotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesQuotes(@javax.annotation.Nullable final java.util.List<SalesQuote> value) {
        this.salesQuotes = value;
    }
    /**
     * Sets the shipmentMethods property value. The shipmentMethods property
     * @param value Value to set for the shipmentMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipmentMethods(@javax.annotation.Nullable final java.util.List<ShipmentMethod> value) {
        this.shipmentMethods = value;
    }
    /**
     * Sets the systemVersion property value. The systemVersion property
     * @param value Value to set for the systemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemVersion(@javax.annotation.Nullable final String value) {
        this.systemVersion = value;
    }
    /**
     * Sets the taxAreas property value. The taxAreas property
     * @param value Value to set for the taxAreas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxAreas(@javax.annotation.Nullable final java.util.List<TaxArea> value) {
        this.taxAreas = value;
    }
    /**
     * Sets the taxGroups property value. The taxGroups property
     * @param value Value to set for the taxGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxGroups(@javax.annotation.Nullable final java.util.List<TaxGroup> value) {
        this.taxGroups = value;
    }
    /**
     * Sets the unitsOfMeasure property value. The unitsOfMeasure property
     * @param value Value to set for the unitsOfMeasure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnitsOfMeasure(@javax.annotation.Nullable final java.util.List<UnitOfMeasure> value) {
        this.unitsOfMeasure = value;
    }
    /**
     * Sets the vendors property value. The vendors property
     * @param value Value to set for the vendors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendors(@javax.annotation.Nullable final java.util.List<Vendor> value) {
        this.vendors = value;
    }
}
