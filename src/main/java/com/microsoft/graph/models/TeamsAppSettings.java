package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAppSettings extends Entity implements Parsable {
    /**
     * Indicates whether users are allowed to request access to the unavailable Teams apps.
     */
    private Boolean allowUserRequestsForAppAccess;
    /**
     * Indicates whether resource-specific consent for chats/meetings has been enabled for the tenant. True indicates that Teams apps that are allowed in the tenant and require resource-specific permissions can be installed inside chats and meetings. False blocks the installation of any Teams app that requires resource-specific permissions in a chat or a meeting.
     */
    private Boolean isChatResourceSpecificConsentEnabled;
    /**
     * Indicates whether resource-specific consent for personal scope in Teams apps has been enabled for the tenant. True indicates that Teams apps that are allowed in the tenant and require resource-specific permissions can be installed in the personal scope. False blocks the installation of any Teams app that requires resource-specific permissions in the personal scope.
     */
    private Boolean isUserPersonalScopeResourceSpecificConsentEnabled;
    /**
     * Instantiates a new teamsAppSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TeamsAppSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAppSettings
     */
    @jakarta.annotation.Nonnull
    public static TeamsAppSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppSettings();
    }
    /**
     * Gets the allowUserRequestsForAppAccess property value. Indicates whether users are allowed to request access to the unavailable Teams apps.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUserRequestsForAppAccess() {
        return this.allowUserRequestsForAppAccess;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowUserRequestsForAppAccess", (n) -> { this.setAllowUserRequestsForAppAccess(n.getBooleanValue()); });
        deserializerMap.put("isChatResourceSpecificConsentEnabled", (n) -> { this.setIsChatResourceSpecificConsentEnabled(n.getBooleanValue()); });
        deserializerMap.put("isUserPersonalScopeResourceSpecificConsentEnabled", (n) -> { this.setIsUserPersonalScopeResourceSpecificConsentEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isChatResourceSpecificConsentEnabled property value. Indicates whether resource-specific consent for chats/meetings has been enabled for the tenant. True indicates that Teams apps that are allowed in the tenant and require resource-specific permissions can be installed inside chats and meetings. False blocks the installation of any Teams app that requires resource-specific permissions in a chat or a meeting.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsChatResourceSpecificConsentEnabled() {
        return this.isChatResourceSpecificConsentEnabled;
    }
    /**
     * Gets the isUserPersonalScopeResourceSpecificConsentEnabled property value. Indicates whether resource-specific consent for personal scope in Teams apps has been enabled for the tenant. True indicates that Teams apps that are allowed in the tenant and require resource-specific permissions can be installed in the personal scope. False blocks the installation of any Teams app that requires resource-specific permissions in the personal scope.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUserPersonalScopeResourceSpecificConsentEnabled() {
        return this.isUserPersonalScopeResourceSpecificConsentEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowUserRequestsForAppAccess", this.getAllowUserRequestsForAppAccess());
        writer.writeBooleanValue("isChatResourceSpecificConsentEnabled", this.getIsChatResourceSpecificConsentEnabled());
        writer.writeBooleanValue("isUserPersonalScopeResourceSpecificConsentEnabled", this.getIsUserPersonalScopeResourceSpecificConsentEnabled());
    }
    /**
     * Sets the allowUserRequestsForAppAccess property value. Indicates whether users are allowed to request access to the unavailable Teams apps.
     * @param value Value to set for the allowUserRequestsForAppAccess property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowUserRequestsForAppAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.allowUserRequestsForAppAccess = value;
    }
    /**
     * Sets the isChatResourceSpecificConsentEnabled property value. Indicates whether resource-specific consent for chats/meetings has been enabled for the tenant. True indicates that Teams apps that are allowed in the tenant and require resource-specific permissions can be installed inside chats and meetings. False blocks the installation of any Teams app that requires resource-specific permissions in a chat or a meeting.
     * @param value Value to set for the isChatResourceSpecificConsentEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsChatResourceSpecificConsentEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isChatResourceSpecificConsentEnabled = value;
    }
    /**
     * Sets the isUserPersonalScopeResourceSpecificConsentEnabled property value. Indicates whether resource-specific consent for personal scope in Teams apps has been enabled for the tenant. True indicates that Teams apps that are allowed in the tenant and require resource-specific permissions can be installed in the personal scope. False blocks the installation of any Teams app that requires resource-specific permissions in the personal scope.
     * @param value Value to set for the isUserPersonalScopeResourceSpecificConsentEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsUserPersonalScopeResourceSpecificConsentEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isUserPersonalScopeResourceSpecificConsentEnabled = value;
    }
}
