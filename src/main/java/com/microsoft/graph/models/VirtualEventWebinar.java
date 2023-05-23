package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventWebinar extends VirtualEvent implements Parsable {
    /** The audience property */
    private MeetingAudience audience;
    /** The coOrganizers property */
    private java.util.List<CommunicationsUserIdentity> coOrganizers;
    /** The registration property */
    private VirtualEventRegistration registration;
    /**
     * Instantiates a new VirtualEventWebinar and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEventWebinar() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEventWebinar
     */
    @javax.annotation.Nonnull
    public static VirtualEventWebinar createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventWebinar();
    }
    /**
     * Gets the audience property value. The audience property
     * @return a meetingAudience
     */
    @javax.annotation.Nullable
    public MeetingAudience getAudience() {
        return this.audience;
    }
    /**
     * Gets the coOrganizers property value. The coOrganizers property
     * @return a communicationsUserIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<CommunicationsUserIdentity> getCoOrganizers() {
        return this.coOrganizers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audience", (n) -> { this.setAudience(n.getEnumValue(MeetingAudience.class)); });
        deserializerMap.put("coOrganizers", (n) -> { this.setCoOrganizers(n.getCollectionOfObjectValues(CommunicationsUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("registration", (n) -> { this.setRegistration(n.getObjectValue(VirtualEventRegistration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the registration property value. The registration property
     * @return a virtualEventRegistration
     */
    @javax.annotation.Nullable
    public VirtualEventRegistration getRegistration() {
        return this.registration;
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
        writer.writeEnumValue("audience", this.getAudience());
        writer.writeCollectionOfObjectValues("coOrganizers", this.getCoOrganizers());
        writer.writeObjectValue("registration", this.getRegistration());
    }
    /**
     * Sets the audience property value. The audience property
     * @param value Value to set for the audience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudience(@javax.annotation.Nullable final MeetingAudience value) {
        this.audience = value;
    }
    /**
     * Sets the coOrganizers property value. The coOrganizers property
     * @param value Value to set for the coOrganizers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoOrganizers(@javax.annotation.Nullable final java.util.List<CommunicationsUserIdentity> value) {
        this.coOrganizers = value;
    }
    /**
     * Sets the registration property value. The registration property
     * @param value Value to set for the registration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistration(@javax.annotation.Nullable final VirtualEventRegistration value) {
        this.registration = value;
    }
}
