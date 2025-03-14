package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupChatTeamsAppInstallationScopeInfo extends TeamsAppInstallationScopeInfo implements Parsable {
    /**
     * Instantiates a new {@link GroupChatTeamsAppInstallationScopeInfo} and sets the default values.
     */
    public GroupChatTeamsAppInstallationScopeInfo() {
        super();
        this.setOdataType("#microsoft.graph.groupChatTeamsAppInstallationScopeInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupChatTeamsAppInstallationScopeInfo}
     */
    @jakarta.annotation.Nonnull
    public static GroupChatTeamsAppInstallationScopeInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupChatTeamsAppInstallationScopeInfo();
    }
    /**
     * Gets the chatId property value. The chatId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChatId() {
        return this.backingStore.get("chatId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("chatId", (n) -> { this.setChatId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("chatId", this.getChatId());
    }
    /**
     * Sets the chatId property value. The chatId property
     * @param value Value to set for the chatId property.
     */
    public void setChatId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("chatId", value);
    }
}
