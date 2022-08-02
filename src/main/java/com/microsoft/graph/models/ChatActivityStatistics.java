package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatActivityStatistics extends ActivityStatistics implements Parsable {
    /** Time spent on chats outside of working hours, which is based on the user's Microsoft Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations. */
    private Period _afterHours;
    /**
     * Instantiates a new ChatActivityStatistics and sets the default values.
     * @return a void
     */
    public ChatActivityStatistics() {
        super();
        this.setOdataType("#microsoft.graph.chatActivityStatistics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatActivityStatistics
     */
    @javax.annotation.Nonnull
    public static ChatActivityStatistics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatActivityStatistics();
    }
    /**
     * Gets the afterHours property value. Time spent on chats outside of working hours, which is based on the user's Microsoft Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAfterHours() {
        return this._afterHours;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChatActivityStatistics currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("afterHours", (n) -> { currentObject.setAfterHours(n.getPeriodValue()); });
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
        writer.writePeriodValue("afterHours", this.getAfterHours());
    }
    /**
     * Sets the afterHours property value. Time spent on chats outside of working hours, which is based on the user's Microsoft Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the afterHours property.
     * @return a void
     */
    public void setAfterHours(@javax.annotation.Nullable final Period value) {
        this._afterHours = value;
    }
}
