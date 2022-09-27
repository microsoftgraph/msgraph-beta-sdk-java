package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftStoreForBusinessContainedApp extends MobileContainedApp implements Parsable {
    /** The app user model ID of the contained app of a MicrosoftStoreForBusinessApp. */
    private String _appUserModelId;
    /**
     * Instantiates a new MicrosoftStoreForBusinessContainedApp and sets the default values.
     * @return a void
     */
    public MicrosoftStoreForBusinessContainedApp() {
        super();
        this.setOdataType("#microsoft.graph.microsoftStoreForBusinessContainedApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftStoreForBusinessContainedApp
     */
    @javax.annotation.Nonnull
    public static MicrosoftStoreForBusinessContainedApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftStoreForBusinessContainedApp();
    }
    /**
     * Gets the appUserModelId property value. The app user model ID of the contained app of a MicrosoftStoreForBusinessApp.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppUserModelId() {
        return this._appUserModelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftStoreForBusinessContainedApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appUserModelId", (n) -> { currentObject.setAppUserModelId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appUserModelId", this.getAppUserModelId());
    }
    /**
     * Sets the appUserModelId property value. The app user model ID of the contained app of a MicrosoftStoreForBusinessApp.
     * @param value Value to set for the appUserModelId property.
     * @return a void
     */
    public void setAppUserModelId(@javax.annotation.Nullable final String value) {
        this._appUserModelId = value;
    }
}
