package com.microsoft.graph.devicemanagement.comanageddevices.downloadappdiagnostics;

import com.microsoft.graph.models.PowerliftDownloadRequest;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the downloadAppDiagnostics method. */
public class DownloadAppDiagnosticsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The request property */
    private PowerliftDownloadRequest _request;
    /**
     * Instantiates a new downloadAppDiagnosticsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DownloadAppDiagnosticsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a downloadAppDiagnosticsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static DownloadAppDiagnosticsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DownloadAppDiagnosticsPostRequestBody();
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("request", (n) -> { this.setRequest(n.getObjectValue(PowerliftDownloadRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the request property value. The request property
     * @return a powerliftDownloadRequest
     */
    @javax.annotation.Nullable
    public PowerliftDownloadRequest getRequest() {
        return this._request;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("request", this.getRequest());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the request property value. The request property
     * @param value Value to set for the request property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequest(@javax.annotation.Nullable final PowerliftDownloadRequest value) {
        this._request = value;
    }
}
