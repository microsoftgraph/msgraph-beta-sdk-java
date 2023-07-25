package com.microsoft.graph.users.item.mailfolders.item.messages.item.markasnotjunk;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MarkAsNotJunkPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The MoveToInbox property
     */
    private Boolean moveToInbox;
    /**
     * Instantiates a new markAsNotJunkPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MarkAsNotJunkPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a markAsNotJunkPostRequestBody
     */
    @javax.annotation.Nonnull
    public static MarkAsNotJunkPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MarkAsNotJunkPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("MoveToInbox", (n) -> { this.setMoveToInbox(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the MoveToInbox property value. The MoveToInbox property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMoveToInbox() {
        return this.moveToInbox;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("MoveToInbox", this.getMoveToInbox());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the MoveToInbox property value. The MoveToInbox property
     * @param value Value to set for the MoveToInbox property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMoveToInbox(@javax.annotation.Nullable final Boolean value) {
        this.moveToInbox = value;
    }
}
