package com.microsoft.graph.teams.item.schedule.timecards.item.clockout;

import com.microsoft.graph.models.ItemBody;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClockOutPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The atApprovedLocation property
     */
    private Boolean atApprovedLocation;
    /**
     * The notes property
     */
    private ItemBody notes;
    /**
     * Instantiates a new clockOutPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ClockOutPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a clockOutPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ClockOutPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClockOutPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the atApprovedLocation property value. The atApprovedLocation property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAtApprovedLocation() {
        return this.atApprovedLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("atApprovedLocation", (n) -> { this.setAtApprovedLocation(n.getBooleanValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. The notes property
     * @return a itemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.notes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("atApprovedLocation", this.getAtApprovedLocation());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the atApprovedLocation property value. The atApprovedLocation property
     * @param value Value to set for the atApprovedLocation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAtApprovedLocation(@jakarta.annotation.Nullable final Boolean value) {
        this.atApprovedLocation = value;
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.notes = value;
    }
}
