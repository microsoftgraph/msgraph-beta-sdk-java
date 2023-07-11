package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEvent extends Entity implements Parsable {
    /**
     * Identity information of who created the virtual event. Inherited from virtualEvent.
     */
    private CommunicationsIdentitySet createdBy;
    /**
     * Description of the virtual event.
     */
    private String description;
    /**
     * Display name of the virtual event
     */
    private String displayName;
    /**
     * End time of the virtual event.
     */
    private DateTimeTimeZone endDateTime;
    /**
     * Presenters' information of the virtual event.
     */
    private java.util.List<VirtualEventPresenter> presenters;
    /**
     * Sessions of the virtual event.
     */
    private java.util.List<VirtualEventSession> sessions;
    /**
     * Start time of the virtual event.
     */
    private DateTimeTimeZone startDateTime;
    /**
     * Status of the virtual event. The possible values are: draft, published, canceled, unknownFutureValue.
     */
    private VirtualEventStatus status;
    /**
     * Instantiates a new virtualEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEvent
     */
    @javax.annotation.Nonnull
    public static VirtualEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.virtualEventWebinar": return new VirtualEventWebinar();
            }
        }
        return new VirtualEvent();
    }
    /**
     * Gets the createdBy property value. Identity information of who created the virtual event. Inherited from virtualEvent.
     * @return a communicationsIdentitySet
     */
    @javax.annotation.Nullable
    public CommunicationsIdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the description property value. Description of the virtual event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name of the virtual event
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDateTime property value. End time of the virtual event.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(CommunicationsIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("presenters", (n) -> { this.setPresenters(n.getCollectionOfObjectValues(VirtualEventPresenter::createFromDiscriminatorValue)); });
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(VirtualEventSession::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(VirtualEventStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the presenters property value. Presenters' information of the virtual event.
     * @return a virtualEventPresenter
     */
    @javax.annotation.Nullable
    public java.util.List<VirtualEventPresenter> getPresenters() {
        return this.presenters;
    }
    /**
     * Gets the sessions property value. Sessions of the virtual event.
     * @return a virtualEventSession
     */
    @javax.annotation.Nullable
    public java.util.List<VirtualEventSession> getSessions() {
        return this.sessions;
    }
    /**
     * Gets the startDateTime property value. Start time of the virtual event.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the status property value. Status of the virtual event. The possible values are: draft, published, canceled, unknownFutureValue.
     * @return a virtualEventStatus
     */
    @javax.annotation.Nullable
    public VirtualEventStatus getStatus() {
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
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeCollectionOfObjectValues("presenters", this.getPresenters());
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdBy property value. Identity information of who created the virtual event. Inherited from virtualEvent.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final CommunicationsIdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the description property value. Description of the virtual event.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name of the virtual event
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDateTime property value. End time of the virtual event.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.endDateTime = value;
    }
    /**
     * Sets the presenters property value. Presenters' information of the virtual event.
     * @param value Value to set for the presenters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPresenters(@javax.annotation.Nullable final java.util.List<VirtualEventPresenter> value) {
        this.presenters = value;
    }
    /**
     * Sets the sessions property value. Sessions of the virtual event.
     * @param value Value to set for the sessions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessions(@javax.annotation.Nullable final java.util.List<VirtualEventSession> value) {
        this.sessions = value;
    }
    /**
     * Sets the startDateTime property value. Start time of the virtual event.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.startDateTime = value;
    }
    /**
     * Sets the status property value. Status of the virtual event. The possible values are: draft, published, canceled, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final VirtualEventStatus value) {
        this.status = value;
    }
}
