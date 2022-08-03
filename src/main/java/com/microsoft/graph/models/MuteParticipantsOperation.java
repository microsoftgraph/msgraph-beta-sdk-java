package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MuteParticipantsOperation extends CommsOperation implements Parsable {
    /** The participants property */
    private java.util.List<String> _participants;
    /**
     * Instantiates a new MuteParticipantsOperation and sets the default values.
     * @return a void
     */
    public MuteParticipantsOperation() {
        super();
        this.setOdataType("#microsoft.graph.muteParticipantsOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MuteParticipantsOperation
     */
    @javax.annotation.Nonnull
    public static MuteParticipantsOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MuteParticipantsOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MuteParticipantsOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("participants", (n) -> { currentObject.setParticipants(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the participants property value. The participants property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getParticipants() {
        return this._participants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("participants", this.getParticipants());
    }
    /**
     * Sets the participants property value. The participants property
     * @param value Value to set for the participants property.
     * @return a void
     */
    public void setParticipants(@javax.annotation.Nullable final java.util.List<String> value) {
        this._participants = value;
    }
}
