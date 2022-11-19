package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkFeaturesConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Email address to send logs and feedback. */
    private String _emailToSendLogsAndFeedback;
    /** True if auto screen shared is enabled. */
    private Boolean _isAutoScreenShareEnabled;
    /** True if Bluetooth beaconing is enabled. */
    private Boolean _isBluetoothBeaconingEnabled;
    /** True if hiding meeting names is enabled. */
    private Boolean _isHideMeetingNamesEnabled;
    /** True if sending logs and feedback is enabled. */
    private Boolean _isSendLogsAndFeedbackEnabled;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new teamworkFeaturesConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkFeaturesConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkFeaturesConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkFeaturesConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkFeaturesConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkFeaturesConfiguration();
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
     * Gets the emailToSendLogsAndFeedback property value. Email address to send logs and feedback.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailToSendLogsAndFeedback() {
        return this._emailToSendLogsAndFeedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkFeaturesConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("emailToSendLogsAndFeedback", (n) -> { currentObject.setEmailToSendLogsAndFeedback(n.getStringValue()); });
        deserializerMap.put("isAutoScreenShareEnabled", (n) -> { currentObject.setIsAutoScreenShareEnabled(n.getBooleanValue()); });
        deserializerMap.put("isBluetoothBeaconingEnabled", (n) -> { currentObject.setIsBluetoothBeaconingEnabled(n.getBooleanValue()); });
        deserializerMap.put("isHideMeetingNamesEnabled", (n) -> { currentObject.setIsHideMeetingNamesEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSendLogsAndFeedbackEnabled", (n) -> { currentObject.setIsSendLogsAndFeedbackEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAutoScreenShareEnabled property value. True if auto screen shared is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAutoScreenShareEnabled() {
        return this._isAutoScreenShareEnabled;
    }
    /**
     * Gets the isBluetoothBeaconingEnabled property value. True if Bluetooth beaconing is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBluetoothBeaconingEnabled() {
        return this._isBluetoothBeaconingEnabled;
    }
    /**
     * Gets the isHideMeetingNamesEnabled property value. True if hiding meeting names is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHideMeetingNamesEnabled() {
        return this._isHideMeetingNamesEnabled;
    }
    /**
     * Gets the isSendLogsAndFeedbackEnabled property value. True if sending logs and feedback is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSendLogsAndFeedbackEnabled() {
        return this._isSendLogsAndFeedbackEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("emailToSendLogsAndFeedback", this.getEmailToSendLogsAndFeedback());
        writer.writeBooleanValue("isAutoScreenShareEnabled", this.getIsAutoScreenShareEnabled());
        writer.writeBooleanValue("isBluetoothBeaconingEnabled", this.getIsBluetoothBeaconingEnabled());
        writer.writeBooleanValue("isHideMeetingNamesEnabled", this.getIsHideMeetingNamesEnabled());
        writer.writeBooleanValue("isSendLogsAndFeedbackEnabled", this.getIsSendLogsAndFeedbackEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the emailToSendLogsAndFeedback property value. Email address to send logs and feedback.
     * @param value Value to set for the emailToSendLogsAndFeedback property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailToSendLogsAndFeedback(@javax.annotation.Nullable final String value) {
        this._emailToSendLogsAndFeedback = value;
    }
    /**
     * Sets the isAutoScreenShareEnabled property value. True if auto screen shared is enabled.
     * @param value Value to set for the isAutoScreenShareEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAutoScreenShareEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isAutoScreenShareEnabled = value;
    }
    /**
     * Sets the isBluetoothBeaconingEnabled property value. True if Bluetooth beaconing is enabled.
     * @param value Value to set for the isBluetoothBeaconingEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBluetoothBeaconingEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isBluetoothBeaconingEnabled = value;
    }
    /**
     * Sets the isHideMeetingNamesEnabled property value. True if hiding meeting names is enabled.
     * @param value Value to set for the isHideMeetingNamesEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHideMeetingNamesEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isHideMeetingNamesEnabled = value;
    }
    /**
     * Sets the isSendLogsAndFeedbackEnabled property value. True if sending logs and feedback is enabled.
     * @param value Value to set for the isSendLogsAndFeedbackEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSendLogsAndFeedbackEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSendLogsAndFeedbackEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
