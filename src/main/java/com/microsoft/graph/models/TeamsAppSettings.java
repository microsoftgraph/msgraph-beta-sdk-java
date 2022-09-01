package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAppSettings extends Entity implements Parsable {
    /** Indicates whether resource-specific consent for chats/meetings has been enabled for the tenant. If true, Teams apps that are allowed in the tenant and require resource-specific permissions can be installed inside chats and meetings. If false, the installation of any Teams app that requires resource-specific permissions in a chat or a meeting will be blocked. */
    private Boolean _isChatResourceSpecificConsentEnabled;
    /**
     * Instantiates a new TeamsAppSettings and sets the default values.
     * @return a void
     */
    public TeamsAppSettings() {
        super();
        this.setOdataType("#microsoft.graph.teamsAppSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamsAppSettings
     */
    @javax.annotation.Nonnull
    public static TeamsAppSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamsAppSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isChatResourceSpecificConsentEnabled", (n) -> { currentObject.setIsChatResourceSpecificConsentEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isChatResourceSpecificConsentEnabled property value. Indicates whether resource-specific consent for chats/meetings has been enabled for the tenant. If true, Teams apps that are allowed in the tenant and require resource-specific permissions can be installed inside chats and meetings. If false, the installation of any Teams app that requires resource-specific permissions in a chat or a meeting will be blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsChatResourceSpecificConsentEnabled() {
        return this._isChatResourceSpecificConsentEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isChatResourceSpecificConsentEnabled", this.getIsChatResourceSpecificConsentEnabled());
    }
    /**
     * Sets the isChatResourceSpecificConsentEnabled property value. Indicates whether resource-specific consent for chats/meetings has been enabled for the tenant. If true, Teams apps that are allowed in the tenant and require resource-specific permissions can be installed inside chats and meetings. If false, the installation of any Teams app that requires resource-specific permissions in a chat or a meeting will be blocked.
     * @param value Value to set for the isChatResourceSpecificConsentEnabled property.
     * @return a void
     */
    public void setIsChatResourceSpecificConsentEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isChatResourceSpecificConsentEnabled = value;
    }
}
