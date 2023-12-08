package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProgramControl extends Entity implements Parsable {
    /**
     * Instantiates a new ProgramControl and sets the default values.
     */
    public ProgramControl() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProgramControl
     */
    @jakarta.annotation.Nonnull
    public static ProgramControl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProgramControl();
    }
    /**
     * Gets the controlId property value. The controlId of the control, in particular the identifier of an access review. Required on create.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getControlId() {
        return this.backingStore.get("controlId");
    }
    /**
     * Gets the controlTypeId property value. The programControlType identifies the type of program control - for example, a control linking to guest access reviews. Required on create.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getControlTypeId() {
        return this.backingStore.get("controlTypeId");
    }
    /**
     * Gets the createdDateTime property value. The creation date and time of the program control.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The name of the control.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("controlId", (n) -> { this.setControlId(n.getStringValue()); });
        deserializerMap.put("controlTypeId", (n) -> { this.setControlTypeId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("program", (n) -> { this.setProgram(n.getObjectValue(Program::createFromDiscriminatorValue)); });
        deserializerMap.put("programId", (n) -> { this.setProgramId(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(ProgramResource::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the owner property value. The user who created the program control.
     * @return a UserIdentity
     */
    @jakarta.annotation.Nullable
    public UserIdentity getOwner() {
        return this.backingStore.get("owner");
    }
    /**
     * Gets the program property value. The program this control is part of.
     * @return a Program
     */
    @jakarta.annotation.Nullable
    public Program getProgram() {
        return this.backingStore.get("program");
    }
    /**
     * Gets the programId property value. The programId of the program this control is a part of. Required on create.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProgramId() {
        return this.backingStore.get("programId");
    }
    /**
     * Gets the resource property value. The resource, a group or an app, targeted by this program control's access review.
     * @return a ProgramResource
     */
    @jakarta.annotation.Nullable
    public ProgramResource getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Gets the status property value. The life cycle status of the control.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("controlId", this.getControlId());
        writer.writeStringValue("controlTypeId", this.getControlTypeId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("owner", this.getOwner());
        writer.writeObjectValue("program", this.getProgram());
        writer.writeStringValue("programId", this.getProgramId());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the controlId property value. The controlId of the control, in particular the identifier of an access review. Required on create.
     * @param value Value to set for the controlId property.
     */
    public void setControlId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("controlId", value);
    }
    /**
     * Sets the controlTypeId property value. The programControlType identifies the type of program control - for example, a control linking to guest access reviews. Required on create.
     * @param value Value to set for the controlTypeId property.
     */
    public void setControlTypeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("controlTypeId", value);
    }
    /**
     * Sets the createdDateTime property value. The creation date and time of the program control.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The name of the control.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the owner property value. The user who created the program control.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("owner", value);
    }
    /**
     * Sets the program property value. The program this control is part of.
     * @param value Value to set for the program property.
     */
    public void setProgram(@jakarta.annotation.Nullable final Program value) {
        this.backingStore.set("program", value);
    }
    /**
     * Sets the programId property value. The programId of the program this control is a part of. Required on create.
     * @param value Value to set for the programId property.
     */
    public void setProgramId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("programId", value);
    }
    /**
     * Sets the resource property value. The resource, a group or an app, targeted by this program control's access review.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final ProgramResource value) {
        this.backingStore.set("resource", value);
    }
    /**
     * Sets the status property value. The life cycle status of the control.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
}
