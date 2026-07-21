package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GenericCase extends CaseEscaped implements Parsable {
    /**
     * Instantiates a new {@link GenericCase} and sets the default values.
     */
    public GenericCase() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.genericCase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GenericCase}
     */
    @jakarta.annotation.Nonnull
    public static GenericCase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GenericCase();
    }
    /**
     * Gets the assignedTo property value. The user assigned to the generic case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the closingNotes property value. Notes recorded when the generic case is closed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClosingNotes() {
        return this.backingStore.get("closingNotes");
    }
    /**
     * Gets the description property value. The description of the generic case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the dueDateTime property value. The target completion date and time for the generic case.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.backingStore.get("dueDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("closingNotes", (n) -> { this.setClosingNotes(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. The priority assigned to the generic case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeStringValue("closingNotes", this.getClosingNotes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeStringValue("priority", this.getPriority());
    }
    /**
     * Sets the assignedTo property value. The user assigned to the generic case.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the closingNotes property value. Notes recorded when the generic case is closed.
     * @param value Value to set for the closingNotes property.
     */
    public void setClosingNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("closingNotes", value);
    }
    /**
     * Sets the description property value. The description of the generic case.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the dueDateTime property value. The target completion date and time for the generic case.
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dueDateTime", value);
    }
    /**
     * Sets the priority property value. The priority assigned to the generic case.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("priority", value);
    }
}
