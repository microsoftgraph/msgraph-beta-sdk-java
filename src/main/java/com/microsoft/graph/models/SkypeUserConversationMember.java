package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SkypeUserConversationMember extends ConversationMember implements Parsable {
    /** Skype ID of the user. */
    private String _skypeId;
    /**
     * Instantiates a new SkypeUserConversationMember and sets the default values.
     * @return a void
     */
    public SkypeUserConversationMember() {
        super();
        this.setOdataType("#microsoft.graph.skypeUserConversationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SkypeUserConversationMember
     */
    @javax.annotation.Nonnull
    public static SkypeUserConversationMember createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SkypeUserConversationMember();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SkypeUserConversationMember currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("skypeId", (n) -> { currentObject.setSkypeId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the skypeId property value. Skype ID of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkypeId() {
        return this._skypeId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("skypeId", this.getSkypeId());
    }
    /**
     * Sets the skypeId property value. Skype ID of the user.
     * @param value Value to set for the skypeId property.
     * @return a void
     */
    public void setSkypeId(@javax.annotation.Nullable final String value) {
        this._skypeId = value;
    }
}
