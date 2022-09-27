package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WinGetApp extends MobileApp implements Parsable {
    /** The install experience settings associated with this application, which are used to ensure the desired install experiences on the target device are taken into account. This includes the account type (System or User) that actions should be run as on target devices. Required at creation time. */
    private WinGetAppInstallExperience _installExperience;
    /** The PackageIdentifier from the WinGet source repository REST API. This also maps to the Id when using the WinGet client command line application. Required at creation time, cannot be modified on existing objects. */
    private String _packageIdentifier;
    /**
     * Instantiates a new WinGetApp and sets the default values.
     * @return a void
     */
    public WinGetApp() {
        super();
        this.setOdataType("#microsoft.graph.winGetApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WinGetApp
     */
    @javax.annotation.Nonnull
    public static WinGetApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WinGetApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WinGetApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("installExperience", (n) -> { currentObject.setInstallExperience(n.getObjectValue(WinGetAppInstallExperience::createFromDiscriminatorValue)); });
            this.put("packageIdentifier", (n) -> { currentObject.setPackageIdentifier(n.getStringValue()); });
        }};
    }
    /**
     * Gets the installExperience property value. The install experience settings associated with this application, which are used to ensure the desired install experiences on the target device are taken into account. This includes the account type (System or User) that actions should be run as on target devices. Required at creation time.
     * @return a winGetAppInstallExperience
     */
    @javax.annotation.Nullable
    public WinGetAppInstallExperience getInstallExperience() {
        return this._installExperience;
    }
    /**
     * Gets the packageIdentifier property value. The PackageIdentifier from the WinGet source repository REST API. This also maps to the Id when using the WinGet client command line application. Required at creation time, cannot be modified on existing objects.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageIdentifier() {
        return this._packageIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("installExperience", this.getInstallExperience());
        writer.writeStringValue("packageIdentifier", this.getPackageIdentifier());
    }
    /**
     * Sets the installExperience property value. The install experience settings associated with this application, which are used to ensure the desired install experiences on the target device are taken into account. This includes the account type (System or User) that actions should be run as on target devices. Required at creation time.
     * @param value Value to set for the installExperience property.
     * @return a void
     */
    public void setInstallExperience(@javax.annotation.Nullable final WinGetAppInstallExperience value) {
        this._installExperience = value;
    }
    /**
     * Sets the packageIdentifier property value. The PackageIdentifier from the WinGet source repository REST API. This also maps to the Id when using the WinGet client command line application. Required at creation time, cannot be modified on existing objects.
     * @param value Value to set for the packageIdentifier property.
     * @return a void
     */
    public void setPackageIdentifier(@javax.annotation.Nullable final String value) {
        this._packageIdentifier = value;
    }
}
