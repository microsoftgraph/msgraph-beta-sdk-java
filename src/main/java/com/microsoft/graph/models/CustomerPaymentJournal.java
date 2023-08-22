package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerPaymentJournal implements AdditionalDataHolder, Parsable {
    /**
     * The account property
     */
    private Account account;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The balancingAccountId property
     */
    private UUID balancingAccountId;
    /**
     * The balancingAccountNumber property
     */
    private String balancingAccountNumber;
    /**
     * The code property
     */
    private String code;
    /**
     * The customerPayments property
     */
    private java.util.List<CustomerPayment> customerPayments;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new customerPaymentJournal and sets the default values.
     */
    public CustomerPaymentJournal() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customerPaymentJournal
     */
    @jakarta.annotation.Nonnull
    public static CustomerPaymentJournal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerPaymentJournal();
    }
    /**
     * Gets the account property value. The account property
     * @return a account
     */
    @jakarta.annotation.Nullable
    public Account getAccount() {
        return this.account;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the balancingAccountId property value. The balancingAccountId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getBalancingAccountId() {
        return this.balancingAccountId;
    }
    /**
     * Gets the balancingAccountNumber property value. The balancingAccountNumber property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBalancingAccountNumber() {
        return this.balancingAccountNumber;
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the customerPayments property value. The customerPayments property
     * @return a customerPayment
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerPayment> getCustomerPayments() {
        return this.customerPayments;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("balancingAccountId", (n) -> { this.setBalancingAccountId(n.getUUIDValue()); });
        deserializerMap.put("balancingAccountNumber", (n) -> { this.setBalancingAccountNumber(n.getStringValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("customerPayments", (n) -> { this.setCustomerPayments(n.getCollectionOfObjectValues(CustomerPayment::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeUUIDValue("balancingAccountId", this.getBalancingAccountId());
        writer.writeStringValue("balancingAccountNumber", this.getBalancingAccountNumber());
        writer.writeStringValue("code", this.getCode());
        writer.writeCollectionOfObjectValues("customerPayments", this.getCustomerPayments());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeUUIDValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     */
    public void setAccount(@jakarta.annotation.Nullable final Account value) {
        this.account = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the balancingAccountId property value. The balancingAccountId property
     * @param value Value to set for the balancingAccountId property.
     */
    public void setBalancingAccountId(@jakarta.annotation.Nullable final UUID value) {
        this.balancingAccountId = value;
    }
    /**
     * Sets the balancingAccountNumber property value. The balancingAccountNumber property
     * @param value Value to set for the balancingAccountNumber property.
     */
    public void setBalancingAccountNumber(@jakarta.annotation.Nullable final String value) {
        this.balancingAccountNumber = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the customerPayments property value. The customerPayments property
     * @param value Value to set for the customerPayments property.
     */
    public void setCustomerPayments(@jakarta.annotation.Nullable final java.util.List<CustomerPayment> value) {
        this.customerPayments = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
