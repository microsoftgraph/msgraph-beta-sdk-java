package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDeploymentSettings extends DeploymentSettings implements Parsable {
    /** Settings governing the user's update experience on a device. */
    private UserExperienceSettings _userExperience;
    /**
     * Instantiates a new WindowsDeploymentSettings and sets the default values.
     * @return a void
     */
    public WindowsDeploymentSettings() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.windowsDeploymentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDeploymentSettings
     */
    @javax.annotation.Nonnull
    public static WindowsDeploymentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDeploymentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDeploymentSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("userExperience", (n) -> { currentObject.setUserExperience(n.getObjectValue(UserExperienceSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the userExperience property value. Settings governing the user's update experience on a device.
     * @return a userExperienceSettings
     */
    @javax.annotation.Nullable
    public UserExperienceSettings getUserExperience() {
        return this._userExperience;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("userExperience", this.getUserExperience());
    }
    /**
     * Sets the userExperience property value. Settings governing the user's update experience on a device.
     * @param value Value to set for the userExperience property.
     * @return a void
     */
    public void setUserExperience(@javax.annotation.Nullable final UserExperienceSettings value) {
        this._userExperience = value;
    }
}
