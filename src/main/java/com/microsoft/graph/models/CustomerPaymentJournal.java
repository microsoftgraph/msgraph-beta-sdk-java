package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class CustomerPaymentJournal extends Entity implements Parsable {
    /** The account property */
    private Account _account;
    /** The balancingAccountId property */
    private String _balancingAccountId;
    /** The balancingAccountNumber property */
    private String _balancingAccountNumber;
    /** The code property */
    private String _code;
    /** The customerPayments property */
    private java.util.List<CustomerPayment> _customerPayments;
    /** The displayName property */
    private String _displayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new customerPaymentJournal and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomerPaymentJournal() {
        super();
        this.setOdataType("#microsoft.graph.customerPaymentJournal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customerPaymentJournal
     */
    @javax.annotation.Nonnull
    public static CustomerPaymentJournal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerPaymentJournal();
    }
    /**
     * Gets the account property value. The account property
     * @return a account
     */
    @javax.annotation.Nullable
    public Account getAccount() {
        return this._account;
    }
    /**
     * Gets the balancingAccountId property value. The balancingAccountId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBalancingAccountId() {
        return this._balancingAccountId;
    }
    /**
     * Gets the balancingAccountNumber property value. The balancingAccountNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBalancingAccountNumber() {
        return this._balancingAccountNumber;
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this._code;
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
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomerPaymentJournal currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { currentObject.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("balancingAccountId", (n) -> { currentObject.setBalancingAccountId(n.getStringValue()); });
        deserializerMap.put("balancingAccountNumber", (n) -> { currentObject.setBalancingAccountNumber(n.getStringValue()); });
        deserializerMap.put("code", (n) -> { currentObject.setCode(n.getStringValue()); });
        deserializerMap.put("customerPayments", (n) -> { currentObject.setCustomerPayments(n.getCollectionOfObjectValues(CustomerPayment::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
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
        writer.writeObjectValue("account", this.getAccount());
        writer.writeStringValue("balancingAccountId", this.getBalancingAccountId());
        writer.writeStringValue("balancingAccountNumber", this.getBalancingAccountNumber());
        writer.writeStringValue("code", this.getCode());
        writer.writeCollectionOfObjectValues("customerPayments", this.getCustomerPayments());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccount(@javax.annotation.Nullable final Account value) {
        this._account = value;
    }
    /**
     * Sets the balancingAccountId property value. The balancingAccountId property
     * @param value Value to set for the balancingAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBalancingAccountId(@javax.annotation.Nullable final String value) {
        this._balancingAccountId = value;
    }
    /**
     * Sets the balancingAccountNumber property value. The balancingAccountNumber property
     * @param value Value to set for the balancingAccountNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBalancingAccountNumber(@javax.annotation.Nullable final String value) {
        this._balancingAccountNumber = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final String value) {
        this._code = value;
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
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
