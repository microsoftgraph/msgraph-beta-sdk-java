package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class ExactMatchUploadAgent extends Entity implements Parsable {
    /** The creationDateTime property */
    private OffsetDateTime _creationDateTime;
    /** The description property */
    private String _description;
    /**
     * Instantiates a new exactMatchUploadAgent and sets the default values.
     * @return a void
     */
    public ExactMatchUploadAgent() {
        super();
        this.setOdataType("#microsoft.graph.exactMatchUploadAgent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exactMatchUploadAgent
     */
    @javax.annotation.Nonnull
    public static ExactMatchUploadAgent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchUploadAgent();
    }
    /**
     * Gets the creationDateTime property value. The creationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this._creationDateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExactMatchUploadAgent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("creationDateTime", (n) -> { currentObject.setCreationDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeStringValue("description", this.getDescription());
    }
    /**
     * Sets the creationDateTime property value. The creationDateTime property
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._creationDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
}
