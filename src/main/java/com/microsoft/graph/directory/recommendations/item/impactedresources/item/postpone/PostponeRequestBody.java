package microsoft.graph.directory.recommendations.item.impactedresources.item.postpone;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the postpone method.  */
public class PostponeRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The postponeUntilDateTime property  */
    private OffsetDateTime _postponeUntilDateTime;
    /**
     * Instantiates a new postponeRequestBody and sets the default values.
     * @return a void
     */
    public PostponeRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a postponeRequestBody
     */
    @javax.annotation.Nonnull
    public static PostponeRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PostponeRequestBody();
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
        final PostponeRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("postponeUntilDateTime", (n) -> { currentObject.setPostponeUntilDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the postponeUntilDateTime property value. The postponeUntilDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPostponeUntilDateTime() {
        return this._postponeUntilDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("postponeUntilDateTime", this.getPostponeUntilDateTime());
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
     * Sets the postponeUntilDateTime property value. The postponeUntilDateTime property
     * @param value Value to set for the postponeUntilDateTime property.
     * @return a void
     */
    public void setPostponeUntilDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._postponeUntilDateTime = value;
    }
}
