package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Settings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies if the user's primary mailbox is hosted in the cloud and is enabled for Microsoft Graph. */
    private Boolean _hasGraphMailbox;
    /** Specifies if the user has a MyAnalytics license assigned. */
    private Boolean _hasLicense;
    /** Specifies if the user opted out of MyAnalytics. */
    private Boolean _hasOptedOut;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new settings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Settings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.settings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a settings
     */
    @javax.annotation.Nonnull
    public static Settings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Settings();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Settings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("hasGraphMailbox", (n) -> { currentObject.setHasGraphMailbox(n.getBooleanValue()); });
        deserializerMap.put("hasLicense", (n) -> { currentObject.setHasLicense(n.getBooleanValue()); });
        deserializerMap.put("hasOptedOut", (n) -> { currentObject.setHasOptedOut(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasGraphMailbox property value. Specifies if the user's primary mailbox is hosted in the cloud and is enabled for Microsoft Graph.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasGraphMailbox() {
        return this._hasGraphMailbox;
    }
    /**
     * Gets the hasLicense property value. Specifies if the user has a MyAnalytics license assigned.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasLicense() {
        return this._hasLicense;
    }
    /**
     * Gets the hasOptedOut property value. Specifies if the user opted out of MyAnalytics.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasOptedOut() {
        return this._hasOptedOut;
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
        writer.writeBooleanValue("hasGraphMailbox", this.getHasGraphMailbox());
        writer.writeBooleanValue("hasLicense", this.getHasLicense());
        writer.writeBooleanValue("hasOptedOut", this.getHasOptedOut());
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
     * Sets the hasGraphMailbox property value. Specifies if the user's primary mailbox is hosted in the cloud and is enabled for Microsoft Graph.
     * @param value Value to set for the hasGraphMailbox property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasGraphMailbox(@javax.annotation.Nullable final Boolean value) {
        this._hasGraphMailbox = value;
    }
    /**
     * Sets the hasLicense property value. Specifies if the user has a MyAnalytics license assigned.
     * @param value Value to set for the hasLicense property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasLicense(@javax.annotation.Nullable final Boolean value) {
        this._hasLicense = value;
    }
    /**
     * Sets the hasOptedOut property value. Specifies if the user opted out of MyAnalytics.
     * @param value Value to set for the hasOptedOut property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasOptedOut(@javax.annotation.Nullable final Boolean value) {
        this._hasOptedOut = value;
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
