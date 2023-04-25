package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeClientCheckinStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The appliedPolicies property */
    private java.util.List<String> appliedPolicies;
    /** The checkinDateTime property */
    private OffsetDateTime checkinDateTime;
    /** The deviceName property */
    private String deviceName;
    /** The devicePlatform property */
    private String devicePlatform;
    /** The devicePlatformVersion property */
    private String devicePlatformVersion;
    /** The errorMessage property */
    private String errorMessage;
    /** The OdataType property */
    private String odataType;
    /** The userId property */
    private String userId;
    /** The userPrincipalName property */
    private String userPrincipalName;
    /** The wasSuccessful property */
    private Boolean wasSuccessful;
    /**
     * Instantiates a new officeClientCheckinStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfficeClientCheckinStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeClientCheckinStatus
     */
    @javax.annotation.Nonnull
    public static OfficeClientCheckinStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeClientCheckinStatus();
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
     * Gets the appliedPolicies property value. The appliedPolicies property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAppliedPolicies() {
        return this.appliedPolicies;
    }
    /**
     * Gets the checkinDateTime property value. The checkinDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCheckinDateTime() {
        return this.checkinDateTime;
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the devicePlatform property value. The devicePlatform property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDevicePlatform() {
        return this.devicePlatform;
    }
    /**
     * Gets the devicePlatformVersion property value. The devicePlatformVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDevicePlatformVersion() {
        return this.devicePlatformVersion;
    }
    /**
     * Gets the errorMessage property value. The errorMessage property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("appliedPolicies", (n) -> { this.setAppliedPolicies(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("checkinDateTime", (n) -> { this.setCheckinDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("devicePlatform", (n) -> { this.setDevicePlatform(n.getStringValue()); });
        deserializerMap.put("devicePlatformVersion", (n) -> { this.setDevicePlatformVersion(n.getStringValue()); });
        deserializerMap.put("errorMessage", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("wasSuccessful", (n) -> { this.setWasSuccessful(n.getBooleanValue()); });
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
     * Gets the wasSuccessful property value. The wasSuccessful property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWasSuccessful() {
        return this.wasSuccessful;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("appliedPolicies", this.getAppliedPolicies());
        writer.writeOffsetDateTimeValue("checkinDateTime", this.getCheckinDateTime());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("devicePlatform", this.getDevicePlatform());
        writer.writeStringValue("devicePlatformVersion", this.getDevicePlatformVersion());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeBooleanValue("wasSuccessful", this.getWasSuccessful());
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
     * Sets the appliedPolicies property value. The appliedPolicies property
     * @param value Value to set for the appliedPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedPolicies(@javax.annotation.Nullable final java.util.List<String> value) {
        this.appliedPolicies = value;
    }
    /**
     * Sets the checkinDateTime property value. The checkinDateTime property
     * @param value Value to set for the checkinDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCheckinDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.checkinDateTime = value;
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the devicePlatform property value. The devicePlatform property
     * @param value Value to set for the devicePlatform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicePlatform(@javax.annotation.Nullable final String value) {
        this.devicePlatform = value;
    }
    /**
     * Sets the devicePlatformVersion property value. The devicePlatformVersion property
     * @param value Value to set for the devicePlatformVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicePlatformVersion(@javax.annotation.Nullable final String value) {
        this.devicePlatformVersion = value;
    }
    /**
     * Sets the errorMessage property value. The errorMessage property
     * @param value Value to set for the errorMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorMessage(@javax.annotation.Nullable final String value) {
        this.errorMessage = value;
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
    /**
     * Sets the wasSuccessful property value. The wasSuccessful property
     * @param value Value to set for the wasSuccessful property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWasSuccessful(@javax.annotation.Nullable final Boolean value) {
        this.wasSuccessful = value;
    }
}
