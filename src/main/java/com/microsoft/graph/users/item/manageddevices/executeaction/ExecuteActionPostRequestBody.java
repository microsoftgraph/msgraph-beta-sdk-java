package com.microsoft.graph.users.item.manageddevices.executeaction;

import com.microsoft.graph.models.ManagedDeviceRemoteAction;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the executeAction method. */
public class ExecuteActionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** The actionName property */
    private ManagedDeviceRemoteAction _actionName;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The carrierUrl property */
    private String _carrierUrl;
    /** The deprovisionReason property */
    private String _deprovisionReason;
    /** The deviceIds property */
    private java.util.List<String> _deviceIds;
    /** The deviceName property */
    private String _deviceName;
    /** The keepEnrollmentData property */
    private Boolean _keepEnrollmentData;
    /** The keepUserData property */
    private Boolean _keepUserData;
    /** The notificationBody property */
    private String _notificationBody;
    /** The notificationTitle property */
    private String _notificationTitle;
    /** The organizationalUnitPath property */
    private String _organizationalUnitPath;
    /** The persistEsimDataPlan property */
    private Boolean _persistEsimDataPlan;
    /**
     * Instantiates a new executeActionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExecuteActionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a executeActionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ExecuteActionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExecuteActionPostRequestBody();
    }
    /**
     * Gets the actionName property value. The actionName property
     * @return a managedDeviceRemoteAction
     */
    @javax.annotation.Nullable
    public ManagedDeviceRemoteAction getActionName() {
        return this._actionName;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the carrierUrl property value. The carrierUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCarrierUrl() {
        return this._carrierUrl;
    }
    /**
     * Gets the deprovisionReason property value. The deprovisionReason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeprovisionReason() {
        return this._deprovisionReason;
    }
    /**
     * Gets the deviceIds property value. The deviceIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDeviceIds() {
        return this._deviceIds;
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(11);
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getEnumValue(ManagedDeviceRemoteAction.class)); });
        deserializerMap.put("carrierUrl", (n) -> { this.setCarrierUrl(n.getStringValue()); });
        deserializerMap.put("deprovisionReason", (n) -> { this.setDeprovisionReason(n.getStringValue()); });
        deserializerMap.put("deviceIds", (n) -> { this.setDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("keepEnrollmentData", (n) -> { this.setKeepEnrollmentData(n.getBooleanValue()); });
        deserializerMap.put("keepUserData", (n) -> { this.setKeepUserData(n.getBooleanValue()); });
        deserializerMap.put("notificationBody", (n) -> { this.setNotificationBody(n.getStringValue()); });
        deserializerMap.put("notificationTitle", (n) -> { this.setNotificationTitle(n.getStringValue()); });
        deserializerMap.put("organizationalUnitPath", (n) -> { this.setOrganizationalUnitPath(n.getStringValue()); });
        deserializerMap.put("persistEsimDataPlan", (n) -> { this.setPersistEsimDataPlan(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keepEnrollmentData property value. The keepEnrollmentData property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeepEnrollmentData() {
        return this._keepEnrollmentData;
    }
    /**
     * Gets the keepUserData property value. The keepUserData property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeepUserData() {
        return this._keepUserData;
    }
    /**
     * Gets the notificationBody property value. The notificationBody property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationBody() {
        return this._notificationBody;
    }
    /**
     * Gets the notificationTitle property value. The notificationTitle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationTitle() {
        return this._notificationTitle;
    }
    /**
     * Gets the organizationalUnitPath property value. The organizationalUnitPath property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationalUnitPath() {
        return this._organizationalUnitPath;
    }
    /**
     * Gets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersistEsimDataPlan() {
        return this._persistEsimDataPlan;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actionName", this.getActionName());
        writer.writeStringValue("carrierUrl", this.getCarrierUrl());
        writer.writeStringValue("deprovisionReason", this.getDeprovisionReason());
        writer.writeCollectionOfPrimitiveValues("deviceIds", this.getDeviceIds());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeBooleanValue("keepEnrollmentData", this.getKeepEnrollmentData());
        writer.writeBooleanValue("keepUserData", this.getKeepUserData());
        writer.writeStringValue("notificationBody", this.getNotificationBody());
        writer.writeStringValue("notificationTitle", this.getNotificationTitle());
        writer.writeStringValue("organizationalUnitPath", this.getOrganizationalUnitPath());
        writer.writeBooleanValue("persistEsimDataPlan", this.getPersistEsimDataPlan());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. The actionName property
     * @param value Value to set for the actionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionName(@javax.annotation.Nullable final ManagedDeviceRemoteAction value) {
        this._actionName = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the carrierUrl property value. The carrierUrl property
     * @param value Value to set for the carrierUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCarrierUrl(@javax.annotation.Nullable final String value) {
        this._carrierUrl = value;
    }
    /**
     * Sets the deprovisionReason property value. The deprovisionReason property
     * @param value Value to set for the deprovisionReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeprovisionReason(@javax.annotation.Nullable final String value) {
        this._deprovisionReason = value;
    }
    /**
     * Sets the deviceIds property value. The deviceIds property
     * @param value Value to set for the deviceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deviceIds = value;
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the keepEnrollmentData property value. The keepEnrollmentData property
     * @param value Value to set for the keepEnrollmentData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeepEnrollmentData(@javax.annotation.Nullable final Boolean value) {
        this._keepEnrollmentData = value;
    }
    /**
     * Sets the keepUserData property value. The keepUserData property
     * @param value Value to set for the keepUserData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeepUserData(@javax.annotation.Nullable final Boolean value) {
        this._keepUserData = value;
    }
    /**
     * Sets the notificationBody property value. The notificationBody property
     * @param value Value to set for the notificationBody property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationBody(@javax.annotation.Nullable final String value) {
        this._notificationBody = value;
    }
    /**
     * Sets the notificationTitle property value. The notificationTitle property
     * @param value Value to set for the notificationTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationTitle(@javax.annotation.Nullable final String value) {
        this._notificationTitle = value;
    }
    /**
     * Sets the organizationalUnitPath property value. The organizationalUnitPath property
     * @param value Value to set for the organizationalUnitPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationalUnitPath(@javax.annotation.Nullable final String value) {
        this._organizationalUnitPath = value;
    }
    /**
     * Sets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @param value Value to set for the persistEsimDataPlan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersistEsimDataPlan(@javax.annotation.Nullable final Boolean value) {
        this._persistEsimDataPlan = value;
    }
}
