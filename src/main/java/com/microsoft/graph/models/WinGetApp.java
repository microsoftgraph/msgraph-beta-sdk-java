package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WinGetApp extends MobileApp implements Parsable {
    /**
     * The install experience settings associated with this application, which are used to ensure the desired install experiences on the target device are taken into account. This includes the account type (System or User) that actions should be run as on target devices. Required at creation time.
     */
    private WinGetAppInstallExperience installExperience;
    /**
     * Hash of package metadata properties used to validate that the application matches the metadata in the source repository.
     */
    private String manifestHash;
    /**
     * The PackageIdentifier from the WinGet source repository REST API. This also maps to the Id when using the WinGet client command line application. Required at creation time, cannot be modified on existing objects.
     */
    private String packageIdentifier;
    /**
     * Instantiates a new WinGetApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("installExperience", (n) -> { this.setInstallExperience(n.getObjectValue(WinGetAppInstallExperience::createFromDiscriminatorValue)); });
        deserializerMap.put("manifestHash", (n) -> { this.setManifestHash(n.getStringValue()); });
        deserializerMap.put("packageIdentifier", (n) -> { this.setPackageIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installExperience property value. The install experience settings associated with this application, which are used to ensure the desired install experiences on the target device are taken into account. This includes the account type (System or User) that actions should be run as on target devices. Required at creation time.
     * @return a winGetAppInstallExperience
     */
    @javax.annotation.Nullable
    public WinGetAppInstallExperience getInstallExperience() {
        return this.installExperience;
    }
    /**
     * Gets the manifestHash property value. Hash of package metadata properties used to validate that the application matches the metadata in the source repository.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManifestHash() {
        return this.manifestHash;
    }
    /**
     * Gets the packageIdentifier property value. The PackageIdentifier from the WinGet source repository REST API. This also maps to the Id when using the WinGet client command line application. Required at creation time, cannot be modified on existing objects.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageIdentifier() {
        return this.packageIdentifier;
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
        writer.writeObjectValue("installExperience", this.getInstallExperience());
        writer.writeStringValue("manifestHash", this.getManifestHash());
        writer.writeStringValue("packageIdentifier", this.getPackageIdentifier());
    }
    /**
     * Sets the installExperience property value. The install experience settings associated with this application, which are used to ensure the desired install experiences on the target device are taken into account. This includes the account type (System or User) that actions should be run as on target devices. Required at creation time.
     * @param value Value to set for the installExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallExperience(@javax.annotation.Nullable final WinGetAppInstallExperience value) {
        this.installExperience = value;
    }
    /**
     * Sets the manifestHash property value. Hash of package metadata properties used to validate that the application matches the metadata in the source repository.
     * @param value Value to set for the manifestHash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManifestHash(@javax.annotation.Nullable final String value) {
        this.manifestHash = value;
    }
    /**
     * Sets the packageIdentifier property value. The PackageIdentifier from the WinGet source repository REST API. This also maps to the Id when using the WinGet client command line application. Required at creation time, cannot be modified on existing objects.
     * @param value Value to set for the packageIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageIdentifier(@javax.annotation.Nullable final String value) {
        this.packageIdentifier = value;
    }
}
