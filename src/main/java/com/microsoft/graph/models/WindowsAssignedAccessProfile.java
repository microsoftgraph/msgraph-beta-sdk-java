package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsAssignedAccessProfile extends Entity implements Parsable {
    /** These are the only Windows Store Apps that will be available to launch from the Start menu. */
    private java.util.List<String> _appUserModelIds;
    /** These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch. */
    private java.util.List<String> _desktopAppPaths;
    /** This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned. */
    private String _profileName;
    /** This setting allows the admin to specify whether the Task Bar is shown or not. */
    private Boolean _showTaskBar;
    /** Allows admins to override the default Start layout and prevents the user from changing it.The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format. */
    private byte[] _startMenuLayoutXml;
    /** The user accounts that will be locked to this kiosk configuration. */
    private java.util.List<String> _userAccounts;
    /**
     * Instantiates a new WindowsAssignedAccessProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsAssignedAccessProfile() {
        super();
        this.setOdataType("#microsoft.graph.windowsAssignedAccessProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsAssignedAccessProfile
     */
    @javax.annotation.Nonnull
    public static WindowsAssignedAccessProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAssignedAccessProfile();
    }
    /**
     * Gets the appUserModelIds property value. These are the only Windows Store Apps that will be available to launch from the Start menu.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAppUserModelIds() {
        return this._appUserModelIds;
    }
    /**
     * Gets the desktopAppPaths property value. These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDesktopAppPaths() {
        return this._desktopAppPaths;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsAssignedAccessProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUserModelIds", (n) -> { currentObject.setAppUserModelIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("desktopAppPaths", (n) -> { currentObject.setDesktopAppPaths(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("profileName", (n) -> { currentObject.setProfileName(n.getStringValue()); });
        deserializerMap.put("showTaskBar", (n) -> { currentObject.setShowTaskBar(n.getBooleanValue()); });
        deserializerMap.put("startMenuLayoutXml", (n) -> { currentObject.setStartMenuLayoutXml(n.getByteArrayValue()); });
        deserializerMap.put("userAccounts", (n) -> { currentObject.setUserAccounts(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileName() {
        return this._profileName;
    }
    /**
     * Gets the showTaskBar property value. This setting allows the admin to specify whether the Task Bar is shown or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowTaskBar() {
        return this._showTaskBar;
    }
    /**
     * Gets the startMenuLayoutXml property value. Allows admins to override the default Start layout and prevents the user from changing it.The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutXml() {
        return this._startMenuLayoutXml;
    }
    /**
     * Gets the userAccounts property value. The user accounts that will be locked to this kiosk configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUserAccounts() {
        return this._userAccounts;
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
    @javax.annotation.Nonnull
    public void setAppUserModelIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._appUserModelIds = value;
    }
    /**
     * Sets the desktopAppPaths property value. These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch.
     * @param value Value to set for the desktopAppPaths property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDesktopAppPaths(@javax.annotation.Nullable final java.util.List<String> value) {
        this._desktopAppPaths = value;
    }
    /**
     * Sets the profileName property value. This is a friendly nameused to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.
     * @param value Value to set for the profileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileName(@javax.annotation.Nullable final String value) {
        this._profileName = value;
    }
    /**
     * Sets the showTaskBar property value. This setting allows the admin to specify whether the Task Bar is shown or not.
     * @param value Value to set for the showTaskBar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowTaskBar(@javax.annotation.Nullable final Boolean value) {
        this._showTaskBar = value;
    }
    /**
     * Sets the startMenuLayoutXml property value. Allows admins to override the default Start layout and prevents the user from changing it.The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.
     * @param value Value to set for the startMenuLayoutXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuLayoutXml(@javax.annotation.Nullable final byte[] value) {
        this._startMenuLayoutXml = value;
    }
    /**
     * Sets the userAccounts property value. The user accounts that will be locked to this kiosk configuration.
     * @param value Value to set for the userAccounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccounts(@javax.annotation.Nullable final java.util.List<String> value) {
        this._userAccounts = value;
    }
}
