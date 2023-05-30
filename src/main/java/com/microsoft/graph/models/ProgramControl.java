package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProgramControl extends Entity implements Parsable {
    /** The controlId of the control, in particular the identifier of an access review. Required on create. */
    private String controlId;
    /** The programControlType identifies the type of program control - for example, a control linking to guest access reviews. Required on create. */
    private String controlTypeId;
    /** The creation date and time of the program control. */
    private OffsetDateTime createdDateTime;
    /** The name of the control. */
    private String displayName;
    /** The user who created the program control. */
    private UserIdentity owner;
    /** The program this control is part of. */
    private Program program;
    /** The programId of the program this control is a part of. Required on create. */
    private String programId;
    /** The resource, a group or an app, targeted by this program control's access review. */
    private ProgramResource resource;
    /** The life cycle status of the control. */
    private String status;
    /**
     * Instantiates a new programControl and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProgramControl() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a programControl
     */
    @javax.annotation.Nonnull
    public static ProgramControl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProgramControl();
    }
    /**
     * Gets the controlId property value. The controlId of the control, in particular the identifier of an access review. Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlId() {
        return this.controlId;
    }
    /**
     * Gets the controlTypeId property value. The programControlType identifies the type of program control - for example, a control linking to guest access reviews. Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlTypeId() {
        return this.controlTypeId;
    }
    /**
     * Gets the createdDateTime property value. The creation date and time of the program control.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. The name of the control.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getOwner() {
        return this.owner;
    }
    /**
     * Gets the program property value. The program this control is part of.
     * @return a program
     */
    @javax.annotation.Nullable
    public Program getProgram() {
        return this.program;
    }
    /**
     * Gets the programId property value. The programId of the program this control is a part of. Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProgramId() {
        return this.programId;
    }
    /**
     * Gets the resource property value. The resource, a group or an app, targeted by this program control's access review.
     * @return a programResource
     */
    @javax.annotation.Nullable
    public ProgramResource getResource() {
        return this.resource;
    }
    /**
     * Gets the status property value. The life cycle status of the control.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControlId(@javax.annotation.Nullable final String value) {
        this.controlId = value;
    }
    /**
     * Sets the controlTypeId property value. The programControlType identifies the type of program control - for example, a control linking to guest access reviews. Required on create.
     * @param value Value to set for the controlTypeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControlTypeId(@javax.annotation.Nullable final String value) {
        this.controlTypeId = value;
    }
    /**
     * Sets the createdDateTime property value. The creation date and time of the program control.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The name of the control.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the owner property value. The user who created the program control.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final UserIdentity value) {
        this.owner = value;
    }
    /**
     * Sets the program property value. The program this control is part of.
     * @param value Value to set for the program property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProgram(@javax.annotation.Nullable final Program value) {
        this.program = value;
    }
    /**
     * Sets the programId property value. The programId of the program this control is a part of. Required on create.
     * @param value Value to set for the programId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProgramId(@javax.annotation.Nullable final String value) {
        this.programId = value;
    }
    /**
     * Sets the resource property value. The resource, a group or an app, targeted by this program control's access review.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final ProgramResource value) {
        this.resource = value;
    }
    /**
     * Sets the status property value. The life cycle status of the control.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
}
