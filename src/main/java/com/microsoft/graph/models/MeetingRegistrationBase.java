package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingRegistrationBase extends Entity implements Parsable {
    /**
     * Instantiates a new MeetingRegistrationBase and sets the default values.
     */
    public MeetingRegistrationBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingRegistrationBase
     */
    @jakarta.annotation.Nonnull
    public static MeetingRegistrationBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.externalMeetingRegistration": return new ExternalMeetingRegistration();
                case "#microsoft.graph.meetingRegistration": return new MeetingRegistration();
            }
        }
        return new MeetingRegistrationBase();
    }
    /**
     * Gets the allowedRegistrant property value. Specifies who can register for the meeting.
     * @return a MeetingAudience
     */
    @jakarta.annotation.Nullable
    public MeetingAudience getAllowedRegistrant() {
        return this.BackingStore.get("allowedRegistrant");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedRegistrant", (n) -> { this.setAllowedRegistrant(n.getEnumValue(MeetingAudience.class)); });
        deserializerMap.put("registrants", (n) -> { this.setRegistrants(n.getCollectionOfObjectValues(MeetingRegistrantBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the registrants property value. Registrants of the online meeting.
     * @return a java.util.List<MeetingRegistrantBase>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingRegistrantBase> getRegistrants() {
        return this.BackingStore.get("registrants");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowedRegistrant", this.getAllowedRegistrant());
        writer.writeCollectionOfObjectValues("registrants", this.getRegistrants());
    }
    /**
     * Sets the allowedRegistrant property value. Specifies who can register for the meeting.
     * @param value Value to set for the allowedRegistrant property.
     */
    public void setAllowedRegistrant(@jakarta.annotation.Nullable final MeetingAudience value) {
        this.BackingStore.set("allowedRegistrant", value);
    }
    /**
     * Sets the registrants property value. Registrants of the online meeting.
     * @param value Value to set for the registrants property.
     */
    public void setRegistrants(@jakarta.annotation.Nullable final java.util.List<MeetingRegistrantBase> value) {
        this.BackingStore.set("registrants", value);
    }
}
