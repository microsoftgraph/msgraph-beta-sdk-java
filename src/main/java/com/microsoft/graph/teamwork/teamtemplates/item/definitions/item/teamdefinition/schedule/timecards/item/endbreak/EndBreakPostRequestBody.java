package microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.schedule.timecards.item.endbreak;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ItemBody;
/** Provides operations to call the endBreak method. */
public class EndBreakPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The atApprovedLocation property */
    private Boolean _atApprovedLocation;
    /** The notes property */
    private ItemBody _notes;
    /**
     * Instantiates a new endBreakPostRequestBody and sets the default values.
     * @return a void
     */
    public EndBreakPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a endBreakPostRequestBody
     */
    @javax.annotation.Nonnull
    public static EndBreakPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndBreakPostRequestBody();
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
     * Gets the atApprovedLocation property value. The atApprovedLocation property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAtApprovedLocation() {
        return this._atApprovedLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EndBreakPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("atApprovedLocation", (n) -> { currentObject.setAtApprovedLocation(n.getBooleanValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the notes property value. The notes property
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getNotes() {
        return this._notes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("atApprovedLocation", this.getAtApprovedLocation());
        writer.writeObjectValue("notes", this.getNotes());
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
     * Sets the atApprovedLocation property value. The atApprovedLocation property
     * @param value Value to set for the atApprovedLocation property.
     * @return a void
     */
    public void setAtApprovedLocation(@javax.annotation.Nullable final Boolean value) {
        this._atApprovedLocation = value;
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final ItemBody value) {
        this._notes = value;
    }
}
