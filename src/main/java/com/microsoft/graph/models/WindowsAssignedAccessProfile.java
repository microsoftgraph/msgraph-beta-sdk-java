package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Assigned Access profile for Windows.
 */
public class WindowsAssignedAccessProfile extends Entity implements Parsable {
    /**
     * These are the only Windows Store Apps that will be available to launch from the Start menu.
     */
    private java.util.List<String> appUserModelIds;
    /**
     * These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch.
     */
    private java.util.List<String> desktopAppPaths;
    /**
     * This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     */
    private String profileName;
    /**
     * This setting allows the admin to specify whether the Task Bar is shown or not.
     */
    private Boolean showTaskBar;
    /**
     * Allows admins to override the default Start layout and prevents the user from changing it.The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.
     */
    private byte[] startMenuLayoutXml;
    /**
     * The user accounts that will be locked to this kiosk configuration.
     */
    private java.util.List<String> userAccounts;
    /**
     * Instantiates a new windowsAssignedAccessProfile and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsAssignedAccessProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsAssignedAccessProfile
     */
    @jakarta.annotation.Nonnull
    public static WindowsAssignedAccessProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAssignedAccessProfile();
    }
    /**
     * Gets the appUserModelIds property value. These are the only Windows Store Apps that will be available to launch from the Start menu.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAppUserModelIds() {
        return this.appUserModelIds;
    }
    /**
     * Gets the desktopAppPaths property value. These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDesktopAppPaths() {
        return this.desktopAppPaths;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUserModelIds", (n) -> { this.setAppUserModelIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("desktopAppPaths", (n) -> { this.setDesktopAppPaths(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("profileName", (n) -> { this.setProfileName(n.getStringValue()); });
        deserializerMap.put("showTaskBar", (n) -> { this.setShowTaskBar(n.getBooleanValue()); });
        deserializerMap.put("startMenuLayoutXml", (n) -> { this.setStartMenuLayoutXml(n.getByteArrayValue()); });
        deserializerMap.put("userAccounts", (n) -> { this.setUserAccounts(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProfileName() {
        return this.profileName;
    }
    /**
     * Gets the showTaskBar property value. This setting allows the admin to specify whether the Task Bar is shown or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowTaskBar() {
        return this.showTaskBar;
    }
    /**
     * Gets the startMenuLayoutXml property value. Allows admins to override the default Start layout and prevents the user from changing it.The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getStartMenuLayoutXml() {
        return this.startMenuLayoutXml;
    }
    /**
     * Gets the userAccounts property value. The user accounts that will be locked to this kiosk configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUserAccounts() {
        return this.userAccounts;
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
        writer.writeCollectionOfPrimitiveValues("appUserModelIds", this.getAppUserModelIds());
        writer.writeCollectionOfPrimitiveValues("desktopAppPaths", this.getDesktopAppPaths());
        writer.writeStringValue("profileName", this.getProfileName());
        writer.writeBooleanValue("showTaskBar", this.getShowTaskBar());
        writer.writeByteArrayValue("startMenuLayoutXml", this.getStartMenuLayoutXml());
        writer.writeCollectionOfPrimitiveValues("userAccounts", this.getUserAccounts());
    }
    /**
     * Sets the appUserModelIds property value. These are the only Windows Store Apps that will be available to launch from the Start menu.
     * @param value Value to set for the appUserModelIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppUserModelIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.appUserModelIds = value;
    }
    /**
     * Sets the desktopAppPaths property value. These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch.
     * @param value Value to set for the desktopAppPaths property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDesktopAppPaths(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.desktopAppPaths = value;
    }
    /**
     * Sets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @param value Value to set for the profileName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProfileName(@jakarta.annotation.Nullable final String value) {
        this.profileName = value;
    }
    /**
     * Sets the showTaskBar property value. This setting allows the admin to specify whether the Task Bar is shown or not.
     * @param value Value to set for the showTaskBar property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setShowTaskBar(@jakarta.annotation.Nullable final Boolean value) {
        this.showTaskBar = value;
    }
    /**
     * Sets the startMenuLayoutXml property value. Allows admins to override the default Start layout and prevents the user from changing it.The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.
     * @param value Value to set for the startMenuLayoutXml property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartMenuLayoutXml(@jakarta.annotation.Nullable final byte[] value) {
        this.startMenuLayoutXml = value;
    }
    /**
     * Sets the userAccounts property value. The user accounts that will be locked to this kiosk configuration.
     * @param value Value to set for the userAccounts property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserAccounts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.userAccounts = value;
    }
}
