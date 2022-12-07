package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BusinessScenarioProperties implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The externalBucketId property */
    private String _externalBucketId;
    /** The externalContextId property */
    private String _externalContextId;
    /** The externalObjectId property */
    private String _externalObjectId;
    /** The externalObjectVersion property */
    private String _externalObjectVersion;
    /** The OdataType property */
    private String _odataType;
    /** The webUrl property */
    private String _webUrl;
    /**
     * Instantiates a new businessScenarioProperties and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BusinessScenarioProperties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a businessScenarioProperties
     */
    @javax.annotation.Nonnull
    public static BusinessScenarioProperties createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessScenarioProperties();
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
     * Gets the externalBucketId property value. The externalBucketId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalBucketId() {
        return this._externalBucketId;
    }
    /**
     * Gets the externalContextId property value. The externalContextId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalContextId() {
        return this._externalContextId;
    }
    /**
     * Gets the externalObjectId property value. The externalObjectId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalObjectId() {
        return this._externalObjectId;
    }
    /**
     * Gets the externalObjectVersion property value. The externalObjectVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalObjectVersion() {
        return this._externalObjectVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("externalBucketId", (n) -> { this.setExternalBucketId(n.getStringValue()); });
        deserializerMap.put("externalContextId", (n) -> { this.setExternalContextId(n.getStringValue()); });
        deserializerMap.put("externalObjectId", (n) -> { this.setExternalObjectId(n.getStringValue()); });
        deserializerMap.put("externalObjectVersion", (n) -> { this.setExternalObjectVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the webUrl property value. The webUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("externalBucketId", this.getExternalBucketId());
        writer.writeStringValue("externalContextId", this.getExternalContextId());
        writer.writeStringValue("externalObjectId", this.getExternalObjectId());
        writer.writeStringValue("externalObjectVersion", this.getExternalObjectVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("webUrl", this.getWebUrl());
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
     * Sets the externalBucketId property value. The externalBucketId property
     * @param value Value to set for the externalBucketId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalBucketId(@javax.annotation.Nullable final String value) {
        this._externalBucketId = value;
    }
    /**
     * Sets the externalContextId property value. The externalContextId property
     * @param value Value to set for the externalContextId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalContextId(@javax.annotation.Nullable final String value) {
        this._externalContextId = value;
    }
    /**
     * Sets the externalObjectId property value. The externalObjectId property
     * @param value Value to set for the externalObjectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalObjectId(@javax.annotation.Nullable final String value) {
        this._externalObjectId = value;
    }
    /**
     * Sets the externalObjectVersion property value. The externalObjectVersion property
     * @param value Value to set for the externalObjectVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalObjectVersion(@javax.annotation.Nullable final String value) {
        this._externalObjectVersion = value;
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
    /**
     * Sets the webUrl property value. The webUrl property
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
