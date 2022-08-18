package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains the localized text to be displayed for a given variant */
public class OrganizationalMessageVariant implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The list of localized texts for this variant */
    private java.util.List<OrganizationalMessageLocalizedText> _localizedTexts;
    /** The name of the variant */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** A unique identifier for this variant */
    private String _variantId;
    /**
     * Instantiates a new organizationalMessageVariant and sets the default values.
     * @return a void
     */
    public OrganizationalMessageVariant() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessageVariant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageVariant
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageVariant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageVariant();
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
        final OrganizationalMessageVariant currentObject = this;
        return new HashMap<>(4) {{
            this.put("localizedTexts", (n) -> { currentObject.setLocalizedTexts(n.getCollectionOfObjectValues(OrganizationalMessageLocalizedText::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("variantId", (n) -> { currentObject.setVariantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the localizedTexts property value. The list of localized texts for this variant
     * @return a organizationalMessageLocalizedText
     */
    @javax.annotation.Nullable
    public java.util.List<OrganizationalMessageLocalizedText> getLocalizedTexts() {
        return this._localizedTexts;
    }
    /**
     * Gets the name property value. The name of the variant
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
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
     * Gets the variantId property value. A unique identifier for this variant
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVariantId() {
        return this._variantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("localizedTexts", this.getLocalizedTexts());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("variantId", this.getVariantId());
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
     * Sets the localizedTexts property value. The list of localized texts for this variant
     * @param value Value to set for the localizedTexts property.
     * @return a void
     */
    public void setLocalizedTexts(@javax.annotation.Nullable final java.util.List<OrganizationalMessageLocalizedText> value) {
        this._localizedTexts = value;
    }
    /**
     * Sets the name property value. The name of the variant
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the variantId property value. A unique identifier for this variant
     * @param value Value to set for the variantId property.
     * @return a void
     */
    public void setVariantId(@javax.annotation.Nullable final String value) {
        this._variantId = value;
    }
}
