package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PstnOnlineMeetingDialoutReport implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Currency used to calculate the cost of the call. For details, see ISO 4217.
     */
    private String currency;
    /**
     * Indicates whether the call was Domestic (within a country or region) or International (outside a country or region) based on the user's location.
     */
    private String destinationContext;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Total costs of all the calls within the selected time range, including call charges and connection fees.
     */
    private BigDecimal totalCallCharge;
    /**
     * Total number of dial-out calls within the selected time range.
     */
    private Integer totalCalls;
    /**
     * Total duration of all the calls within the selected time range, in seconds.
     */
    private Integer totalCallSeconds;
    /**
     * Country code of the user. For details, see ISO 3166-1 alpha-2.
     */
    private String usageLocation;
    /**
     * Display name of the user.
     */
    private String userDisplayName;
    /**
     * The unique identifier (GUID) of the user in Azure Active Directory.
     */
    private String userId;
    /**
     * The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new pstnOnlineMeetingDialoutReport and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PstnOnlineMeetingDialoutReport() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pstnOnlineMeetingDialoutReport
     */
    @javax.annotation.Nonnull
    public static PstnOnlineMeetingDialoutReport createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PstnOnlineMeetingDialoutReport();
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
     * Gets the currency property value. Currency used to calculate the cost of the call. For details, see ISO 4217.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the destinationContext property value. Indicates whether the call was Domestic (within a country or region) or International (outside a country or region) based on the user's location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationContext() {
        return this.destinationContext;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("destinationContext", (n) -> { this.setDestinationContext(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("totalCallCharge", (n) -> { this.setTotalCallCharge(n.getBigDecimalValue()); });
        deserializerMap.put("totalCalls", (n) -> { this.setTotalCalls(n.getIntegerValue()); });
        deserializerMap.put("totalCallSeconds", (n) -> { this.setTotalCallSeconds(n.getIntegerValue()); });
        deserializerMap.put("usageLocation", (n) -> { this.setUsageLocation(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the totalCallCharge property value. Total costs of all the calls within the selected time range, including call charges and connection fees.
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTotalCallCharge() {
        return this.totalCallCharge;
    }
    /**
     * Gets the totalCalls property value. Total number of dial-out calls within the selected time range.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalCalls() {
        return this.totalCalls;
    }
    /**
     * Gets the totalCallSeconds property value. Total duration of all the calls within the selected time range, in seconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalCallSeconds() {
        return this.totalCallSeconds;
    }
    /**
     * Gets the usageLocation property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsageLocation() {
        return this.usageLocation;
    }
    /**
     * Gets the userDisplayName property value. Display name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. The unique identifier (GUID) of the user in Azure Active Directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
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
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("destinationContext", this.getDestinationContext());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBigDecimalValue("totalCallCharge", this.getTotalCallCharge());
        writer.writeIntegerValue("totalCalls", this.getTotalCalls());
        writer.writeIntegerValue("totalCallSeconds", this.getTotalCallSeconds());
        writer.writeStringValue("usageLocation", this.getUsageLocation());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the currency property value. Currency used to calculate the cost of the call. For details, see ISO 4217.
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the destinationContext property value. Indicates whether the call was Domestic (within a country or region) or International (outside a country or region) based on the user's location.
     * @param value Value to set for the destinationContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationContext(@javax.annotation.Nullable final String value) {
        this.destinationContext = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the totalCallCharge property value. Total costs of all the calls within the selected time range, including call charges and connection fees.
     * @param value Value to set for the totalCallCharge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCallCharge(@javax.annotation.Nullable final BigDecimal value) {
        this.totalCallCharge = value;
    }
    /**
     * Sets the totalCalls property value. Total number of dial-out calls within the selected time range.
     * @param value Value to set for the totalCalls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCalls(@javax.annotation.Nullable final Integer value) {
        this.totalCalls = value;
    }
    /**
     * Sets the totalCallSeconds property value. Total duration of all the calls within the selected time range, in seconds.
     * @param value Value to set for the totalCallSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCallSeconds(@javax.annotation.Nullable final Integer value) {
        this.totalCallSeconds = value;
    }
    /**
     * Sets the usageLocation property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the usageLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsageLocation(@javax.annotation.Nullable final String value) {
        this.usageLocation = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. The unique identifier (GUID) of the user in Azure Active Directory.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
