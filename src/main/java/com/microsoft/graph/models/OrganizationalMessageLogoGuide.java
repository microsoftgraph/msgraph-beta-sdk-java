package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Example logo and its size requirements */
public class OrganizationalMessageLogoGuide implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The asset name is the key for this specific logo. This is used to compute the required token when accessing the logoCdnUrl to fetch the logo */
    private String _assetName;
    /** The required size dimensions of the logo */
    private OrganizationalMessageLogoDimensions _dimensions;
    /** The url at which the logo resides */
    private String _logoCdnUrl;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new organizationalMessageLogoGuide and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalMessageLogoGuide() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessageLogoGuide");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageLogoGuide
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageLogoGuide createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageLogoGuide();
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
     * Gets the assetName property value. The asset name is the key for this specific logo. This is used to compute the required token when accessing the logoCdnUrl to fetch the logo
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetName() {
        return this._assetName;
    }
    /**
     * Gets the dimensions property value. The required size dimensions of the logo
     * @return a organizationalMessageLogoDimensions
     */
    @javax.annotation.Nullable
    public OrganizationalMessageLogoDimensions getDimensions() {
        return this._dimensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalMessageLogoGuide currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("assetName", (n) -> { currentObject.setAssetName(n.getStringValue()); });
            this.put("dimensions", (n) -> { currentObject.setDimensions(n.getObjectValue(OrganizationalMessageLogoDimensions::createFromDiscriminatorValue)); });
            this.put("logoCdnUrl", (n) -> { currentObject.setLogoCdnUrl(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the logoCdnUrl property value. The url at which the logo resides
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoCdnUrl() {
        return this._logoCdnUrl;
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
        writer.writeStringValue("assetName", this.getAssetName());
        writer.writeObjectValue("dimensions", this.getDimensions());
        writer.writeStringValue("logoCdnUrl", this.getLogoCdnUrl());
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
     * Sets the assetName property value. The asset name is the key for this specific logo. This is used to compute the required token when accessing the logoCdnUrl to fetch the logo
     * @param value Value to set for the assetName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetName(@javax.annotation.Nullable final String value) {
        this._assetName = value;
    }
    /**
     * Sets the dimensions property value. The required size dimensions of the logo
     * @param value Value to set for the dimensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDimensions(@javax.annotation.Nullable final OrganizationalMessageLogoDimensions value) {
        this._dimensions = value;
    }
    /**
     * Sets the logoCdnUrl property value. The url at which the logo resides
     * @param value Value to set for the logoCdnUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogoCdnUrl(@javax.annotation.Nullable final String value) {
        this._logoCdnUrl = value;
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
