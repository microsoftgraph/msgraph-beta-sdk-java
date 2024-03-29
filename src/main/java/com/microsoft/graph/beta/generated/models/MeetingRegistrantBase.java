package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingRegistrantBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MeetingRegistrantBase} and sets the default values.
     */
    public MeetingRegistrantBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MeetingRegistrantBase}
     */
    @jakarta.annotation.Nonnull
    public static MeetingRegistrantBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.externalMeetingRegistrant": return new ExternalMeetingRegistrant();
                case "#microsoft.graph.meetingRegistrant": return new MeetingRegistrant();
            }
        }
        return new MeetingRegistrantBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinWebUrl property value. A unique web URL for the registrant to join the meeting. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.backingStore.get("joinWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
    }
    /**
     * Sets the joinWebUrl property value. A unique web URL for the registrant to join the meeting. Read-only.
     * @param value Value to set for the joinWebUrl property.
     */
    public void setJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("joinWebUrl", value);
    }
}
