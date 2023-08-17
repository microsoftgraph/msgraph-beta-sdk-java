package com.microsoft.graph.teamtemplatedefinition.item.teamdefinition.schedule.timecards.clockin;

import com.microsoft.graph.models.ItemBody;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClockInPostRequestBody implements AdditionalDataHolder, Parsable {
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
     * The onBehalfOfUserId property
     */
    private String onBehalfOfUserId;
    /**
     * Instantiates a new clockInPostRequestBody and sets the default values.
     */
    public ClockInPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a clockInPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ClockInPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClockInPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("atApprovedLocation", (n) -> { this.setAtApprovedLocation(n.getBooleanValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("onBehalfOfUserId", (n) -> { this.setOnBehalfOfUserId(n.getStringValue()); });
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
     * Gets the onBehalfOfUserId property value. The onBehalfOfUserId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOnBehalfOfUserId() {
        return this.onBehalfOfUserId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("atApprovedLocation", this.getAtApprovedLocation());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeStringValue("onBehalfOfUserId", this.getOnBehalfOfUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the atApprovedLocation property value. The atApprovedLocation property
     * @param value Value to set for the atApprovedLocation property.
     */
    public void setAtApprovedLocation(@jakarta.annotation.Nullable final Boolean value) {
        this.atApprovedLocation = value;
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.notes = value;
    }
    /**
     * Sets the onBehalfOfUserId property value. The onBehalfOfUserId property
     * @param value Value to set for the onBehalfOfUserId property.
     */
    public void setOnBehalfOfUserId(@jakarta.annotation.Nullable final String value) {
        this.onBehalfOfUserId = value;
    }
}
