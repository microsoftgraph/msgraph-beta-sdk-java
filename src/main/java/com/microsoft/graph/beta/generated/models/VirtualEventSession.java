package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventSession extends OnlineMeetingBase implements Parsable {
    /**
     * Instantiates a new VirtualEventSession and sets the default values.
     */
    public VirtualEventSession() {
        super();
        this.setOdataType("#microsoft.graph.virtualEventSession");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEventSession
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventSession();
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("presenters", (n) -> { this.setPresenters(n.getCollectionOfObjectValues(VirtualEventPresenter::createFromDiscriminatorValue)); });
        deserializerMap.put("registrations", (n) -> { this.setRegistrations(n.getCollectionOfObjectValues(VirtualEventRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the presenters property value. The presenters property
     * @return a java.util.List<VirtualEventPresenter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventPresenter> getPresenters() {
        return this.backingStore.get("presenters");
    }
    /**
     * Gets the registrations property value. The registrations property
     * @return a java.util.List<VirtualEventRegistration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventRegistration> getRegistrations() {
        return this.backingStore.get("registrations");
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeCollectionOfObjectValues("presenters", this.getPresenters());
        writer.writeCollectionOfObjectValues("registrations", this.getRegistrations());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the presenters property value. The presenters property
     * @param value Value to set for the presenters property.
     */
    public void setPresenters(@jakarta.annotation.Nullable final java.util.List<VirtualEventPresenter> value) {
        this.backingStore.set("presenters", value);
    }
    /**
     * Sets the registrations property value. The registrations property
     * @param value Value to set for the registrations property.
     */
    public void setRegistrations(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistration> value) {
        this.backingStore.set("registrations", value);
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("startDateTime", value);
    }
}
