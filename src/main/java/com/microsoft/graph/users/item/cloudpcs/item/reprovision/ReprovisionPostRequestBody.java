package microsoft.graph.users.item.cloudpcs.item.reprovision;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.CloudPcOperatingSystem;
import microsoft.graph.models.CloudPcUserAccountType;
/** Provides operations to call the reprovision method. */
public class ReprovisionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The osVersion property */
    private CloudPcOperatingSystem _osVersion;
    /** The userAccountType property */
    private CloudPcUserAccountType _userAccountType;
    /**
     * Instantiates a new reprovisionPostRequestBody and sets the default values.
     * @return a void
     */
    public ReprovisionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a reprovisionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ReprovisionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReprovisionPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ReprovisionPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getEnumValue(CloudPcOperatingSystem.class)); });
            this.put("userAccountType", (n) -> { currentObject.setUserAccountType(n.getEnumValue(CloudPcUserAccountType.class)); });
        }};
    }
    /**
     * Gets the osVersion property value. The osVersion property
     * @return a cloudPcOperatingSystem
     */
    @javax.annotation.Nullable
    public CloudPcOperatingSystem getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the userAccountType property value. The userAccountType property
     * @return a cloudPcUserAccountType
     */
    @javax.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this._userAccountType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("osVersion", this.getOsVersion());
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the osVersion property value. The osVersion property
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final CloudPcOperatingSystem value) {
        this._osVersion = value;
    }
    /**
     * Sets the userAccountType property value. The userAccountType property
     * @param value Value to set for the userAccountType property.
     * @return a void
     */
    public void setUserAccountType(@javax.annotation.Nullable final CloudPcUserAccountType value) {
        this._userAccountType = value;
    }
}
