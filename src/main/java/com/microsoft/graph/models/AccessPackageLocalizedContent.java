package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageLocalizedContent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The fallback string, which is used when a requested localization is not available. Required. */
    private String _defaultText;
    /** Content represented in a format for a specific locale. */
    private java.util.List<AccessPackageLocalizedText> _localizedTexts;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new accessPackageLocalizedContent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageLocalizedContent() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageLocalizedContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageLocalizedContent
     */
    @javax.annotation.Nonnull
    public static AccessPackageLocalizedContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageLocalizedContent();
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
     * Gets the defaultText property value. The fallback string, which is used when a requested localization is not available. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultText() {
        return this._defaultText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageLocalizedContent currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("defaultText", (n) -> { currentObject.setDefaultText(n.getStringValue()); });
            this.put("localizedTexts", (n) -> { currentObject.setLocalizedTexts(n.getCollectionOfObjectValues(AccessPackageLocalizedText::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the localizedTexts property value. Content represented in a format for a specific locale.
     * @return a accessPackageLocalizedText
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageLocalizedText> getLocalizedTexts() {
        return this._localizedTexts;
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
        writer.writeStringValue("defaultText", this.getDefaultText());
        writer.writeCollectionOfObjectValues("localizedTexts", this.getLocalizedTexts());
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
     * Sets the defaultText property value. The fallback string, which is used when a requested localization is not available. Required.
     * @param value Value to set for the defaultText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultText(@javax.annotation.Nullable final String value) {
        this._defaultText = value;
    }
    /**
     * Sets the localizedTexts property value. Content represented in a format for a specific locale.
     * @param value Value to set for the localizedTexts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalizedTexts(@javax.annotation.Nullable final java.util.List<AccessPackageLocalizedText> value) {
        this._localizedTexts = value;
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
