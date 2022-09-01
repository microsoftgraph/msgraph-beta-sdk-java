package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** OEM Warranty information for a given device */
public class OemWarranty implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of additional warranty offers. This collection can contain a maximum of 100 elements. */
    private java.util.List<WarrantyOffer> _additionalWarranties;
    /** List of base warranty offers. This collection can contain a maximum of 100 elements. */
    private java.util.List<WarrantyOffer> _baseWarranties;
    /** Device configuration page URL */
    private String _deviceConfigurationUrl;
    /** Device warranty page URL */
    private String _deviceWarrantyUrl;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new oemWarranty and sets the default values.
     * @return a void
     */
    public OemWarranty() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.oemWarranty");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a oemWarranty
     */
    @javax.annotation.Nonnull
    public static OemWarranty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OemWarranty();
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
     * Gets the additionalWarranties property value. List of additional warranty offers. This collection can contain a maximum of 100 elements.
     * @return a warrantyOffer
     */
    @javax.annotation.Nullable
    public java.util.List<WarrantyOffer> getAdditionalWarranties() {
        return this._additionalWarranties;
    }
    /**
     * Gets the baseWarranties property value. List of base warranty offers. This collection can contain a maximum of 100 elements.
     * @return a warrantyOffer
     */
    @javax.annotation.Nullable
    public java.util.List<WarrantyOffer> getBaseWarranties() {
        return this._baseWarranties;
    }
    /**
     * Gets the deviceConfigurationUrl property value. Device configuration page URL
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceConfigurationUrl() {
        return this._deviceConfigurationUrl;
    }
    /**
     * Gets the deviceWarrantyUrl property value. Device warranty page URL
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceWarrantyUrl() {
        return this._deviceWarrantyUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OemWarranty currentObject = this;
        return new HashMap<>(5) {{
            this.put("additionalWarranties", (n) -> { currentObject.setAdditionalWarranties(n.getCollectionOfObjectValues(WarrantyOffer::createFromDiscriminatorValue)); });
            this.put("baseWarranties", (n) -> { currentObject.setBaseWarranties(n.getCollectionOfObjectValues(WarrantyOffer::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationUrl", (n) -> { currentObject.setDeviceConfigurationUrl(n.getStringValue()); });
            this.put("deviceWarrantyUrl", (n) -> { currentObject.setDeviceWarrantyUrl(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("additionalWarranties", this.getAdditionalWarranties());
        writer.writeCollectionOfObjectValues("baseWarranties", this.getBaseWarranties());
        writer.writeStringValue("deviceConfigurationUrl", this.getDeviceConfigurationUrl());
        writer.writeStringValue("deviceWarrantyUrl", this.getDeviceWarrantyUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the additionalWarranties property value. List of additional warranty offers. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the additionalWarranties property.
     * @return a void
     */
    public void setAdditionalWarranties(@javax.annotation.Nullable final java.util.List<WarrantyOffer> value) {
        this._additionalWarranties = value;
    }
    /**
     * Sets the baseWarranties property value. List of base warranty offers. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the baseWarranties property.
     * @return a void
     */
    public void setBaseWarranties(@javax.annotation.Nullable final java.util.List<WarrantyOffer> value) {
        this._baseWarranties = value;
    }
    /**
     * Sets the deviceConfigurationUrl property value. Device configuration page URL
     * @param value Value to set for the deviceConfigurationUrl property.
     * @return a void
     */
    public void setDeviceConfigurationUrl(@javax.annotation.Nullable final String value) {
        this._deviceConfigurationUrl = value;
    }
    /**
     * Sets the deviceWarrantyUrl property value. Device warranty page URL
     * @param value Value to set for the deviceWarrantyUrl property.
     * @return a void
     */
    public void setDeviceWarrantyUrl(@javax.annotation.Nullable final String value) {
        this._deviceWarrantyUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
