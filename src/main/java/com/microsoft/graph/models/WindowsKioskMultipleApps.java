package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskMultipleApps extends WindowsKioskAppConfiguration implements Parsable {
    /** This setting allows access to Downloads folder in file explorer. */
    private Boolean _allowAccessToDownloadsFolder;
    /** These are the only Windows Store Apps that will be available to launch from the Start menu. This collection can contain a maximum of 128 elements. */
    private java.util.List<WindowsKioskAppBase> _apps;
    /** This setting indicates that desktop apps are allowed. Default to true. */
    private Boolean _disallowDesktopApps;
    /** This setting allows the admin to specify whether the Task Bar is shown or not. */
    private Boolean _showTaskBar;
    /** Allows admins to override the default Start layout and prevents the user from changing it.The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format. */
    private byte[] _startMenuLayoutXml;
    /**
     * Instantiates a new WindowsKioskMultipleApps and sets the default values.
     * @return a void
     */
    public WindowsKioskMultipleApps() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskMultipleApps");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskMultipleApps
     */
    @javax.annotation.Nonnull
    public static WindowsKioskMultipleApps createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskMultipleApps();
    }
    /**
     * Gets the allowAccessToDownloadsFolder property value. This setting allows access to Downloads folder in file explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAccessToDownloadsFolder() {
        return this._allowAccessToDownloadsFolder;
    }
    /**
     * Gets the apps property value. These are the only Windows Store Apps that will be available to launch from the Start menu. This collection can contain a maximum of 128 elements.
     * @return a windowsKioskAppBase
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsKioskAppBase> getApps() {
        return this._apps;
    }
    /**
     * Gets the disallowDesktopApps property value. This setting indicates that desktop apps are allowed. Default to true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisallowDesktopApps() {
        return this._disallowDesktopApps;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskMultipleApps currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowAccessToDownloadsFolder", (n) -> { currentObject.setAllowAccessToDownloadsFolder(n.getBooleanValue()); });
            this.put("apps", (n) -> { currentObject.setApps(n.getCollectionOfObjectValues(WindowsKioskAppBase::createFromDiscriminatorValue)); });
            this.put("disallowDesktopApps", (n) -> { currentObject.setDisallowDesktopApps(n.getBooleanValue()); });
            this.put("showTaskBar", (n) -> { currentObject.setShowTaskBar(n.getBooleanValue()); });
            this.put("startMenuLayoutXml", (n) -> { currentObject.setStartMenuLayoutXml(n.getByteArrayValue()); });
        }};
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowAccessToDownloadsFolder", this.getAllowAccessToDownloadsFolder());
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeBooleanValue("disallowDesktopApps", this.getDisallowDesktopApps());
        writer.writeBooleanValue("showTaskBar", this.getShowTaskBar());
        writer.writeByteArrayValue("startMenuLayoutXml", this.getStartMenuLayoutXml());
    }
    /**
     * Sets the allowAccessToDownloadsFolder property value. This setting allows access to Downloads folder in file explorer.
     * @param value Value to set for the allowAccessToDownloadsFolder property.
     * @return a void
     */
    public void setAllowAccessToDownloadsFolder(@javax.annotation.Nullable final Boolean value) {
        this._allowAccessToDownloadsFolder = value;
    }
    /**
     * Sets the apps property value. These are the only Windows Store Apps that will be available to launch from the Start menu. This collection can contain a maximum of 128 elements.
     * @param value Value to set for the apps property.
     * @return a void
     */
    public void setApps(@javax.annotation.Nullable final java.util.List<WindowsKioskAppBase> value) {
        this._apps = value;
    }
    /**
     * Sets the disallowDesktopApps property value. This setting indicates that desktop apps are allowed. Default to true.
     * @param value Value to set for the disallowDesktopApps property.
     * @return a void
     */
    public void setDisallowDesktopApps(@javax.annotation.Nullable final Boolean value) {
        this._disallowDesktopApps = value;
    }
    /**
     * Sets the showTaskBar property value. This setting allows the admin to specify whether the Task Bar is shown or not.
     * @param value Value to set for the showTaskBar property.
     * @return a void
     */
    public void setShowTaskBar(@javax.annotation.Nullable final Boolean value) {
        this._showTaskBar = value;
    }
    /**
     * Sets the startMenuLayoutXml property value. Allows admins to override the default Start layout and prevents the user from changing it.The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.
     * @param value Value to set for the startMenuLayoutXml property.
     * @return a void
     */
    public void setStartMenuLayoutXml(@javax.annotation.Nullable final byte[] value) {
        this._startMenuLayoutXml = value;
    }
}
