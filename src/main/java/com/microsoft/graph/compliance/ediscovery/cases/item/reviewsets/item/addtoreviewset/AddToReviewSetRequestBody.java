package microsoft.graph.compliance.ediscovery.cases.item.reviewsets.item.addtoreviewset;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ediscovery.AdditionalDataOptions;
import microsoft.graph.models.ediscovery.SourceCollection;
/** Provides operations to call the addToReviewSet method. */
public class AddToReviewSetRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The additionalDataOptions property */
    private AdditionalDataOptions _additionalDataOptions;
    /** The sourceCollection property */
    private SourceCollection _sourceCollection;
    /**
     * Instantiates a new addToReviewSetRequestBody and sets the default values.
     * @return a void
     */
    public AddToReviewSetRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a addToReviewSetRequestBody
     */
    @javax.annotation.Nonnull
    public static AddToReviewSetRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddToReviewSetRequestBody();
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
     * Gets the additionalDataOptions property value. The additionalDataOptions property
     * @return a additionalDataOptions
     */
    @javax.annotation.Nullable
    public AdditionalDataOptions getAdditionalDataOptions() {
        return this._additionalDataOptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AddToReviewSetRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("additionalDataOptions", (n) -> { currentObject.setAdditionalDataOptions(n.getEnumValue(AdditionalDataOptions.class)); });
            this.put("sourceCollection", (n) -> { currentObject.setSourceCollection(n.getObjectValue(SourceCollection::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the sourceCollection property value. The sourceCollection property
     * @return a sourceCollection
     */
    @javax.annotation.Nullable
    public SourceCollection getSourceCollection() {
        return this._sourceCollection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("additionalDataOptions", this.getAdditionalDataOptions());
        writer.writeObjectValue("sourceCollection", this.getSourceCollection());
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
     * Sets the additionalDataOptions property value. The additionalDataOptions property
     * @param value Value to set for the additionalDataOptions property.
     * @return a void
     */
    public void setAdditionalDataOptions(@javax.annotation.Nullable final AdditionalDataOptions value) {
        this._additionalDataOptions = value;
    }
    /**
     * Sets the sourceCollection property value. The sourceCollection property
     * @param value Value to set for the sourceCollection property.
     * @return a void
     */
    public void setSourceCollection(@javax.annotation.Nullable final SourceCollection value) {
        this._sourceCollection = value;
    }
}
