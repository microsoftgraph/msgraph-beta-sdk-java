package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactMatchDetectedSensitiveContent extends DetectedSensitiveContentBase implements Parsable {
    /** The matches property  */
    private java.util.List<SensitiveContentLocation> _matches;
    /**
     * Instantiates a new exactMatchDetectedSensitiveContent and sets the default values.
     * @return a void
     */
    public ExactMatchDetectedSensitiveContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exactMatchDetectedSensitiveContent
     */
    @javax.annotation.Nonnull
    public static ExactMatchDetectedSensitiveContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchDetectedSensitiveContent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExactMatchDetectedSensitiveContent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("matches", (n) -> { currentObject.setMatches(n.getCollectionOfObjectValues(SensitiveContentLocation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the matches property value. The matches property
     * @return a sensitiveContentLocation
     */
    @javax.annotation.Nullable
    public java.util.List<SensitiveContentLocation> getMatches() {
        return this._matches;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("matches", this.getMatches());
    }
    /**
     * Sets the matches property value. The matches property
     * @param value Value to set for the matches property.
     * @return a void
     */
    public void setMatches(@javax.annotation.Nullable final java.util.List<SensitiveContentLocation> value) {
        this._matches = value;
    }
}
