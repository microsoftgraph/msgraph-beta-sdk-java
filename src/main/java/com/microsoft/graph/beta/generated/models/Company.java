package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Company implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Company} and sets the default values.
     */
    public Company() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Company}
     */
    @jakarta.annotation.Nonnull
    public static Company createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Company();
    }
    /**
     * Gets the accounts property value. The accounts property
     * @return a {@link java.util.List<Account>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Account> getAccounts() {
        return this.backingStore.get("accounts");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the agedAccountsPayable property value. The agedAccountsPayable property
     * @return a {@link java.util.List<AgedAccountsPayable>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgedAccountsPayable> getAgedAccountsPayable() {
        return this.backingStore.get("agedAccountsPayable");
    }
    /**
     * Gets the agedAccountsReceivable property value. The agedAccountsReceivable property
     * @return a {@link java.util.List<AgedAccountsReceivable>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgedAccountsReceivable> getAgedAccountsReceivable() {
        return this.backingStore.get("agedAccountsReceivable");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the businessProfileId property value. The businessProfileId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessProfileId() {
        return this.backingStore.get("businessProfileId");
    }
    /**
     * Gets the companyInformation property value. The companyInformation property
     * @return a {@link java.util.List<CompanyInformation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompanyInformation> getCompanyInformation() {
        return this.backingStore.get("companyInformation");
    }
    /**
     * Gets the countriesRegions property value. The countriesRegions property
     * @return a {@link java.util.List<CountryRegion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CountryRegion> getCountriesRegions() {
        return this.backingStore.get("countriesRegions");
    }
    /**
     * Gets the currencies property value. The currencies property
     * @return a {@link java.util.List<Currency>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Currency> getCurrencies() {
        return this.backingStore.get("currencies");
    }
    /**
     * Gets the customerPaymentJournals property value. The customerPaymentJournals property
     * @return a {@link java.util.List<CustomerPaymentJournal>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerPaymentJournal> getCustomerPaymentJournals() {
        return this.backingStore.get("customerPaymentJournals");
    }
    /**
     * Gets the customerPayments property value. The customerPayments property
     * @return a {@link java.util.List<CustomerPayment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerPayment> getCustomerPayments() {
        return this.backingStore.get("customerPayments");
    }
    /**
     * Gets the customers property value. The customers property
     * @return a {@link java.util.List<Customer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Customer> getCustomers() {
        return this.backingStore.get("customers");
    }
    /**
     * Gets the dimensions property value. The dimensions property
     * @return a {@link java.util.List<Dimension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Dimension> getDimensions() {
        return this.backingStore.get("dimensions");
    }
    /**
     * Gets the dimensionValues property value. The dimensionValues property
     * @return a {@link java.util.List<DimensionValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DimensionValue> getDimensionValues() {
        return this.backingStore.get("dimensionValues");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the employees property value. The employees property
     * @return a {@link java.util.List<Employee>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Employee> getEmployees() {
        return this.backingStore.get("employees");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link java.util.List<GeneralLedgerEntry>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GeneralLedgerEntry> getGeneralLedgerEntries() {
        return this.backingStore.get("generalLedgerEntries");
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the itemCategories property value. The itemCategories property
     * @return a {@link java.util.List<ItemCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemCategory> getItemCategories() {
        return this.backingStore.get("itemCategories");
    }
    /**
     * Gets the items property value. The items property
     * @return a {@link java.util.List<Item>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Item> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the journalLines property value. The journalLines property
     * @return a {@link java.util.List<JournalLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<JournalLine> getJournalLines() {
        return this.backingStore.get("journalLines");
    }
    /**
     * Gets the journals property value. The journals property
     * @return a {@link java.util.List<Journal>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Journal> getJournals() {
        return this.backingStore.get("journals");
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the paymentMethods property value. The paymentMethods property
     * @return a {@link java.util.List<PaymentMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentMethod> getPaymentMethods() {
        return this.backingStore.get("paymentMethods");
    }
    /**
     * Gets the paymentTerms property value. The paymentTerms property
     * @return a {@link java.util.List<PaymentTerm>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentTerm> getPaymentTerms() {
        return this.backingStore.get("paymentTerms");
    }
    /**
     * Gets the picture property value. The picture property
     * @return a {@link java.util.List<Picture>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.backingStore.get("picture");
    }
    /**
     * Gets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @return a {@link java.util.List<PurchaseInvoiceLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PurchaseInvoiceLine> getPurchaseInvoiceLines() {
        return this.backingStore.get("purchaseInvoiceLines");
    }
    /**
     * Gets the purchaseInvoices property value. The purchaseInvoices property
     * @return a {@link java.util.List<PurchaseInvoice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PurchaseInvoice> getPurchaseInvoices() {
        return this.backingStore.get("purchaseInvoices");
    }
    /**
     * Gets the salesCreditMemoLines property value. The salesCreditMemoLines property
     * @return a {@link java.util.List<SalesCreditMemoLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesCreditMemoLine> getSalesCreditMemoLines() {
        return this.backingStore.get("salesCreditMemoLines");
    }
    /**
     * Gets the salesCreditMemos property value. The salesCreditMemos property
     * @return a {@link java.util.List<SalesCreditMemo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesCreditMemo> getSalesCreditMemos() {
        return this.backingStore.get("salesCreditMemos");
    }
    /**
     * Gets the salesInvoiceLines property value. The salesInvoiceLines property
     * @return a {@link java.util.List<SalesInvoiceLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesInvoiceLine> getSalesInvoiceLines() {
        return this.backingStore.get("salesInvoiceLines");
    }
    /**
     * Gets the salesInvoices property value. The salesInvoices property
     * @return a {@link java.util.List<SalesInvoice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesInvoice> getSalesInvoices() {
        return this.backingStore.get("salesInvoices");
    }
    /**
     * Gets the salesOrderLines property value. The salesOrderLines property
     * @return a {@link java.util.List<SalesOrderLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesOrderLine> getSalesOrderLines() {
        return this.backingStore.get("salesOrderLines");
    }
    /**
     * Gets the salesOrders property value. The salesOrders property
     * @return a {@link java.util.List<SalesOrder>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesOrder> getSalesOrders() {
        return this.backingStore.get("salesOrders");
    }
    /**
     * Gets the salesQuoteLines property value. The salesQuoteLines property
     * @return a {@link java.util.List<SalesQuoteLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesQuoteLine> getSalesQuoteLines() {
        return this.backingStore.get("salesQuoteLines");
    }
    /**
     * Gets the salesQuotes property value. The salesQuotes property
     * @return a {@link java.util.List<SalesQuote>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesQuote> getSalesQuotes() {
        return this.backingStore.get("salesQuotes");
    }
    /**
     * Gets the shipmentMethods property value. The shipmentMethods property
     * @return a {@link java.util.List<ShipmentMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShipmentMethod> getShipmentMethods() {
        return this.backingStore.get("shipmentMethods");
    }
    /**
     * Gets the systemVersion property value. The systemVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSystemVersion() {
        return this.backingStore.get("systemVersion");
    }
    /**
     * Gets the taxAreas property value. The taxAreas property
     * @return a {@link java.util.List<TaxArea>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaxArea> getTaxAreas() {
        return this.backingStore.get("taxAreas");
    }
    /**
     * Gets the taxGroups property value. The taxGroups property
     * @return a {@link java.util.List<TaxGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaxGroup> getTaxGroups() {
        return this.backingStore.get("taxGroups");
    }
    /**
     * Gets the unitsOfMeasure property value. The unitsOfMeasure property
     * @return a {@link java.util.List<UnitOfMeasure>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnitOfMeasure> getUnitsOfMeasure() {
        return this.backingStore.get("unitsOfMeasure");
    }
    /**
     * Gets the vendors property value. The vendors property
     * @return a {@link java.util.List<Vendor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Vendor> getVendors() {
        return this.backingStore.get("vendors");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccounts(@jakarta.annotation.Nullable final java.util.List<Account> value) {
        this.backingStore.set("accounts", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the agedAccountsPayable property value. The agedAccountsPayable property
     * @param value Value to set for the agedAccountsPayable property.
     */
    public void setAgedAccountsPayable(@jakarta.annotation.Nullable final java.util.List<AgedAccountsPayable> value) {
        this.backingStore.set("agedAccountsPayable", value);
    }
    /**
     * Sets the agedAccountsReceivable property value. The agedAccountsReceivable property
     * @param value Value to set for the agedAccountsReceivable property.
     */
    public void setAgedAccountsReceivable(@jakarta.annotation.Nullable final java.util.List<AgedAccountsReceivable> value) {
        this.backingStore.set("agedAccountsReceivable", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the businessProfileId property value. The businessProfileId property
     * @param value Value to set for the businessProfileId property.
     */
    public void setBusinessProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("businessProfileId", value);
    }
    /**
     * Sets the companyInformation property value. The companyInformation property
     * @param value Value to set for the companyInformation property.
     */
    public void setCompanyInformation(@jakarta.annotation.Nullable final java.util.List<CompanyInformation> value) {
        this.backingStore.set("companyInformation", value);
    }
    /**
     * Sets the countriesRegions property value. The countriesRegions property
     * @param value Value to set for the countriesRegions property.
     */
    public void setCountriesRegions(@jakarta.annotation.Nullable final java.util.List<CountryRegion> value) {
        this.backingStore.set("countriesRegions", value);
    }
    /**
     * Sets the currencies property value. The currencies property
     * @param value Value to set for the currencies property.
     */
    public void setCurrencies(@jakarta.annotation.Nullable final java.util.List<Currency> value) {
        this.backingStore.set("currencies", value);
    }
    /**
     * Sets the customerPaymentJournals property value. The customerPaymentJournals property
     * @param value Value to set for the customerPaymentJournals property.
     */
    public void setCustomerPaymentJournals(@jakarta.annotation.Nullable final java.util.List<CustomerPaymentJournal> value) {
        this.backingStore.set("customerPaymentJournals", value);
    }
    /**
     * Sets the customerPayments property value. The customerPayments property
     * @param value Value to set for the customerPayments property.
     */
    public void setCustomerPayments(@jakarta.annotation.Nullable final java.util.List<CustomerPayment> value) {
        this.backingStore.set("customerPayments", value);
    }
    /**
     * Sets the customers property value. The customers property
     * @param value Value to set for the customers property.
     */
    public void setCustomers(@jakarta.annotation.Nullable final java.util.List<Customer> value) {
        this.backingStore.set("customers", value);
    }
    /**
     * Sets the dimensions property value. The dimensions property
     * @param value Value to set for the dimensions property.
     */
    public void setDimensions(@jakarta.annotation.Nullable final java.util.List<Dimension> value) {
        this.backingStore.set("dimensions", value);
    }
    /**
     * Sets the dimensionValues property value. The dimensionValues property
     * @param value Value to set for the dimensionValues property.
     */
    public void setDimensionValues(@jakarta.annotation.Nullable final java.util.List<DimensionValue> value) {
        this.backingStore.set("dimensionValues", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the employees property value. The employees property
     * @param value Value to set for the employees property.
     */
    public void setEmployees(@jakarta.annotation.Nullable final java.util.List<Employee> value) {
        this.backingStore.set("employees", value);
    }
    /**
     * Sets the generalLedgerEntries property value. The generalLedgerEntries property
     * @param value Value to set for the generalLedgerEntries property.
     */
    public void setGeneralLedgerEntries(@jakarta.annotation.Nullable final java.util.List<GeneralLedgerEntry> value) {
        this.backingStore.set("generalLedgerEntries", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the itemCategories property value. The itemCategories property
     * @param value Value to set for the itemCategories property.
     */
    public void setItemCategories(@jakarta.annotation.Nullable final java.util.List<ItemCategory> value) {
        this.backingStore.set("itemCategories", value);
    }
    /**
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<Item> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the journalLines property value. The journalLines property
     * @param value Value to set for the journalLines property.
     */
    public void setJournalLines(@jakarta.annotation.Nullable final java.util.List<JournalLine> value) {
        this.backingStore.set("journalLines", value);
    }
    /**
     * Sets the journals property value. The journals property
     * @param value Value to set for the journals property.
     */
    public void setJournals(@jakarta.annotation.Nullable final java.util.List<Journal> value) {
        this.backingStore.set("journals", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the paymentMethods property value. The paymentMethods property
     * @param value Value to set for the paymentMethods property.
     */
    public void setPaymentMethods(@jakarta.annotation.Nullable final java.util.List<PaymentMethod> value) {
        this.backingStore.set("paymentMethods", value);
    }
    /**
     * Sets the paymentTerms property value. The paymentTerms property
     * @param value Value to set for the paymentTerms property.
     */
    public void setPaymentTerms(@jakarta.annotation.Nullable final java.util.List<PaymentTerm> value) {
        this.backingStore.set("paymentTerms", value);
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     */
    public void setPicture(@jakarta.annotation.Nullable final java.util.List<Picture> value) {
        this.backingStore.set("picture", value);
    }
    /**
     * Sets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @param value Value to set for the purchaseInvoiceLines property.
     */
    public void setPurchaseInvoiceLines(@jakarta.annotation.Nullable final java.util.List<PurchaseInvoiceLine> value) {
        this.backingStore.set("purchaseInvoiceLines", value);
    }
    /**
     * Sets the purchaseInvoices property value. The purchaseInvoices property
     * @param value Value to set for the purchaseInvoices property.
     */
    public void setPurchaseInvoices(@jakarta.annotation.Nullable final java.util.List<PurchaseInvoice> value) {
        this.backingStore.set("purchaseInvoices", value);
    }
    /**
     * Sets the salesCreditMemoLines property value. The salesCreditMemoLines property
     * @param value Value to set for the salesCreditMemoLines property.
     */
    public void setSalesCreditMemoLines(@jakarta.annotation.Nullable final java.util.List<SalesCreditMemoLine> value) {
        this.backingStore.set("salesCreditMemoLines", value);
    }
    /**
     * Sets the salesCreditMemos property value. The salesCreditMemos property
     * @param value Value to set for the salesCreditMemos property.
     */
    public void setSalesCreditMemos(@jakarta.annotation.Nullable final java.util.List<SalesCreditMemo> value) {
        this.backingStore.set("salesCreditMemos", value);
    }
    /**
     * Sets the salesInvoiceLines property value. The salesInvoiceLines property
     * @param value Value to set for the salesInvoiceLines property.
     */
    public void setSalesInvoiceLines(@jakarta.annotation.Nullable final java.util.List<SalesInvoiceLine> value) {
        this.backingStore.set("salesInvoiceLines", value);
    }
    /**
     * Sets the salesInvoices property value. The salesInvoices property
     * @param value Value to set for the salesInvoices property.
     */
    public void setSalesInvoices(@jakarta.annotation.Nullable final java.util.List<SalesInvoice> value) {
        this.backingStore.set("salesInvoices", value);
    }
    /**
     * Sets the salesOrderLines property value. The salesOrderLines property
     * @param value Value to set for the salesOrderLines property.
     */
    public void setSalesOrderLines(@jakarta.annotation.Nullable final java.util.List<SalesOrderLine> value) {
        this.backingStore.set("salesOrderLines", value);
    }
    /**
     * Sets the salesOrders property value. The salesOrders property
     * @param value Value to set for the salesOrders property.
     */
    public void setSalesOrders(@jakarta.annotation.Nullable final java.util.List<SalesOrder> value) {
        this.backingStore.set("salesOrders", value);
    }
    /**
     * Sets the salesQuoteLines property value. The salesQuoteLines property
     * @param value Value to set for the salesQuoteLines property.
     */
    public void setSalesQuoteLines(@jakarta.annotation.Nullable final java.util.List<SalesQuoteLine> value) {
        this.backingStore.set("salesQuoteLines", value);
    }
    /**
     * Sets the salesQuotes property value. The salesQuotes property
     * @param value Value to set for the salesQuotes property.
     */
    public void setSalesQuotes(@jakarta.annotation.Nullable final java.util.List<SalesQuote> value) {
        this.backingStore.set("salesQuotes", value);
    }
    /**
     * Sets the shipmentMethods property value. The shipmentMethods property
     * @param value Value to set for the shipmentMethods property.
     */
    public void setShipmentMethods(@jakarta.annotation.Nullable final java.util.List<ShipmentMethod> value) {
        this.backingStore.set("shipmentMethods", value);
    }
    /**
     * Sets the systemVersion property value. The systemVersion property
     * @param value Value to set for the systemVersion property.
     */
    public void setSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("systemVersion", value);
    }
    /**
     * Sets the taxAreas property value. The taxAreas property
     * @param value Value to set for the taxAreas property.
     */
    public void setTaxAreas(@jakarta.annotation.Nullable final java.util.List<TaxArea> value) {
        this.backingStore.set("taxAreas", value);
    }
    /**
     * Sets the taxGroups property value. The taxGroups property
     * @param value Value to set for the taxGroups property.
     */
    public void setTaxGroups(@jakarta.annotation.Nullable final java.util.List<TaxGroup> value) {
        this.backingStore.set("taxGroups", value);
    }
    /**
     * Sets the unitsOfMeasure property value. The unitsOfMeasure property
     * @param value Value to set for the unitsOfMeasure property.
     */
    public void setUnitsOfMeasure(@jakarta.annotation.Nullable final java.util.List<UnitOfMeasure> value) {
        this.backingStore.set("unitsOfMeasure", value);
    }
    /**
     * Sets the vendors property value. The vendors property
     * @param value Value to set for the vendors property.
     */
    public void setVendors(@jakarta.annotation.Nullable final java.util.List<Vendor> value) {
        this.backingStore.set("vendors", value);
    }
}
