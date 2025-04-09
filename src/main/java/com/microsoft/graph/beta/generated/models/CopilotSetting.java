package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotSetting} and sets the default values.
     */
    public CopilotSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotSetting}
     */
    @jakarta.annotation.Nonnull
    public static CopilotSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("people", (n) -> { this.setPeople(n.getObjectValue(CopilotPeopleAdminSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the people property value. The people property
     * @return a {@link CopilotPeopleAdminSetting}
     */
    @jakarta.annotation.Nullable
    public CopilotPeopleAdminSetting getPeople() {
        return this.backingStore.get("people");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("people", this.getPeople());
    }
    /**
     * Sets the people property value. The people property
     * @param value Value to set for the people property.
     */
    public void setPeople(@jakarta.annotation.Nullable final CopilotPeopleAdminSetting value) {
        this.backingStore.set("people", value);
    }
}
