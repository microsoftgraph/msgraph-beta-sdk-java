package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SmsLogRow implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The callCharge property */
    private BigDecimal callCharge;
    /** The currency property */
    private String currency;
    /** The destinationContext property */
    private String destinationContext;
    /** The destinationName property */
    private String destinationName;
    /** The destinationNumber property */
    private String destinationNumber;
    /** The id property */
    private String id;
    /** The licenseCapability property */
    private String licenseCapability;
    /** The OdataType property */
    private String odataType;
    /** The otherPartyCountryCode property */
    private String otherPartyCountryCode;
    /** The sentDateTime property */
    private OffsetDateTime sentDateTime;
    /** The smsId property */
    private String smsId;
    /** The smsType property */
    private String smsType;
    /** The smsUnits property */
    private Integer smsUnits;
    /** The sourceNumber property */
    private String sourceNumber;
    /** The tenantCountryCode property */
    private String tenantCountryCode;
    /** The userCountryCode property */
    private String userCountryCode;
    /** The userDisplayName property */
    private String userDisplayName;
    /** The userId property */
    private String userId;
    /** The userPrincipalName property */
    private String userPrincipalName;
    /**
     * Instantiates a new smsLogRow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SmsLogRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a smsLogRow
     */
    @javax.annotation.Nonnull
    public static SmsLogRow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsLogRow();
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
     * Gets the callCharge property value. The callCharge property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getCallCharge() {
        return this.callCharge;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the destinationContext property value. The destinationContext property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationContext() {
        return this.destinationContext;
    }
    /**
     * Gets the destinationName property value. The destinationName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationName() {
        return this.destinationName;
    }
    /**
     * Gets the destinationNumber property value. The destinationNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationNumber() {
        return this.destinationNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("callCharge", (n) -> { this.setCallCharge(n.getBigDecimalValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("destinationContext", (n) -> { this.setDestinationContext(n.getStringValue()); });
        deserializerMap.put("destinationName", (n) -> { this.setDestinationName(n.getStringValue()); });
        deserializerMap.put("destinationNumber", (n) -> { this.setDestinationNumber(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("licenseCapability", (n) -> { this.setLicenseCapability(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("otherPartyCountryCode", (n) -> { this.setOtherPartyCountryCode(n.getStringValue()); });
        deserializerMap.put("sentDateTime", (n) -> { this.setSentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("smsId", (n) -> { this.setSmsId(n.getStringValue()); });
        deserializerMap.put("smsType", (n) -> { this.setSmsType(n.getStringValue()); });
        deserializerMap.put("smsUnits", (n) -> { this.setSmsUnits(n.getIntegerValue()); });
        deserializerMap.put("sourceNumber", (n) -> { this.setSourceNumber(n.getStringValue()); });
        deserializerMap.put("tenantCountryCode", (n) -> { this.setTenantCountryCode(n.getStringValue()); });
        deserializerMap.put("userCountryCode", (n) -> { this.setUserCountryCode(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the licenseCapability property value. The licenseCapability property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLicenseCapability() {
        return this.licenseCapability;
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
     * Gets the otherPartyCountryCode property value. The otherPartyCountryCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOtherPartyCountryCode() {
        return this.otherPartyCountryCode;
    }
    /**
     * Gets the sentDateTime property value. The sentDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSentDateTime() {
        return this.sentDateTime;
    }
    /**
     * Gets the smsId property value. The smsId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSmsId() {
        return this.smsId;
    }
    /**
     * Gets the smsType property value. The smsType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSmsType() {
        return this.smsType;
    }
    /**
     * Gets the smsUnits property value. The smsUnits property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSmsUnits() {
        return this.smsUnits;
    }
    /**
     * Gets the sourceNumber property value. The sourceNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceNumber() {
        return this.sourceNumber;
    }
    /**
     * Gets the tenantCountryCode property value. The tenantCountryCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantCountryCode() {
        return this.tenantCountryCode;
    }
    /**
     * Gets the userCountryCode property value. The userCountryCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserCountryCode() {
        return this.userCountryCode;
    }
    /**
     * Gets the userDisplayName property value. The userDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBigDecimalValue("callCharge", this.getCallCharge());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("destinationContext", this.getDestinationContext());
        writer.writeStringValue("destinationName", this.getDestinationName());
        writer.writeStringValue("destinationNumber", this.getDestinationNumber());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("licenseCapability", this.getLicenseCapability());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("otherPartyCountryCode", this.getOtherPartyCountryCode());
        writer.writeOffsetDateTimeValue("sentDateTime", this.getSentDateTime());
        writer.writeStringValue("smsId", this.getSmsId());
        writer.writeStringValue("smsType", this.getSmsType());
        writer.writeIntegerValue("smsUnits", this.getSmsUnits());
        writer.writeStringValue("sourceNumber", this.getSourceNumber());
        writer.writeStringValue("tenantCountryCode", this.getTenantCountryCode());
        writer.writeStringValue("userCountryCode", this.getUserCountryCode());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the callCharge property value. The callCharge property
     * @param value Value to set for the callCharge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallCharge(@javax.annotation.Nullable final BigDecimal value) {
        this.callCharge = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the destinationContext property value. The destinationContext property
     * @param value Value to set for the destinationContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationContext(@javax.annotation.Nullable final String value) {
        this.destinationContext = value;
    }
    /**
     * Sets the destinationName property value. The destinationName property
     * @param value Value to set for the destinationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationName(@javax.annotation.Nullable final String value) {
        this.destinationName = value;
    }
    /**
     * Sets the destinationNumber property value. The destinationNumber property
     * @param value Value to set for the destinationNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationNumber(@javax.annotation.Nullable final String value) {
        this.destinationNumber = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the licenseCapability property value. The licenseCapability property
     * @param value Value to set for the licenseCapability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicenseCapability(@javax.annotation.Nullable final String value) {
        this.licenseCapability = value;
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
     * Sets the otherPartyCountryCode property value. The otherPartyCountryCode property
     * @param value Value to set for the otherPartyCountryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOtherPartyCountryCode(@javax.annotation.Nullable final String value) {
        this.otherPartyCountryCode = value;
    }
    /**
     * Sets the sentDateTime property value. The sentDateTime property
     * @param value Value to set for the sentDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.sentDateTime = value;
    }
    /**
     * Sets the smsId property value. The smsId property
     * @param value Value to set for the smsId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmsId(@javax.annotation.Nullable final String value) {
        this.smsId = value;
    }
    /**
     * Sets the smsType property value. The smsType property
     * @param value Value to set for the smsType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmsType(@javax.annotation.Nullable final String value) {
        this.smsType = value;
    }
    /**
     * Sets the smsUnits property value. The smsUnits property
     * @param value Value to set for the smsUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmsUnits(@javax.annotation.Nullable final Integer value) {
        this.smsUnits = value;
    }
    /**
     * Sets the sourceNumber property value. The sourceNumber property
     * @param value Value to set for the sourceNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceNumber(@javax.annotation.Nullable final String value) {
        this.sourceNumber = value;
    }
    /**
     * Sets the tenantCountryCode property value. The tenantCountryCode property
     * @param value Value to set for the tenantCountryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantCountryCode(@javax.annotation.Nullable final String value) {
        this.tenantCountryCode = value;
    }
    /**
     * Sets the userCountryCode property value. The userCountryCode property
     * @param value Value to set for the userCountryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserCountryCode(@javax.annotation.Nullable final String value) {
        this.userCountryCode = value;
    }
    /**
     * Sets the userDisplayName property value. The userDisplayName property
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
